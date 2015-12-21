package com.pluscubed.picasaclient;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.AccountPicker;
import com.google.android.gms.common.GoogleApiAvailability;
import com.pluscubed.picasaclient.model.albumfeed.AlbumFeed;
import com.pluscubed.picasaclient.model.albumfeed.AlbumFeedResponse;
import com.pluscubed.picasaclient.model.userfeed.UserFeed;
import com.pluscubed.picasaclient.model.userfeed.UserFeedResponse;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;
import rx.Single;
import rx.SingleSubscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class PicasaClient {

    private static final String SCOPE_PICASA = "https://picasaweb.google.com/data/";
    private static final String BASE_API_URL = "https://picasaweb.google.com/data/feed/api/user/";

    private static final int REQUEST_ACCOUNT_PICKER = 1000;
    private static final int REQUEST_RECOVER_PLAY_SERVICES_ERROR = 1024;

    private static final String ACCOUNT_TYPE_GOOGLE = "com.google";


    private static PicasaClient picasaClient;
    private Activity mActivity;
    private Account mAccount;
    private String mOAuthToken;
    private PicasaService mPicasaService;

    private PicasaClient() {
    }

    public static PicasaClient get() {
        if (picasaClient == null) {
            picasaClient = new PicasaClient();
        }
        return picasaClient;
    }

    public void attachActivity(Activity activity) {
        mActivity = activity;
    }

    public void detachActivity() {
        mActivity = null;
    }

    public void setAccount(Account account) {
        if (account.type.equals(ACCOUNT_TYPE_GOOGLE)) {
            mAccount = account;

            retrieveTokenInitService();
        } else {
            throw new RuntimeException("You may only set a Google account");
        }
    }

    private void initService() {
        OkHttpClient client = new OkHttpClient();
        client.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request originalRequest = chain.request();
                if (originalRequest.body() != null || originalRequest.header("Authorization") != null) {
                    return chain.proceed(originalRequest);
                }

                HttpUrl jsonUrl = originalRequest.httpUrl().newBuilder()
                        .addQueryParameter("alt", "json")
                        .build();

                Request authorizedRequest = originalRequest.newBuilder()
                        .url(jsonUrl)
                        .header("Authorization", "Bearer " + mOAuthToken)
                        .header("Gdata-version", "2")
                        .build();
                return chain.proceed(authorizedRequest);
            }
        });

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();

        mPicasaService = retrofit.create(PicasaService.class);
    }


    public void pickAccount() {
        String[] accountTypes = new String[]{ACCOUNT_TYPE_GOOGLE};
        Intent intent = AccountPicker.newChooseAccountIntent(null, null, accountTypes, false, null, null, null, null);
        mActivity.startActivityForResult(intent, REQUEST_ACCOUNT_PICKER);
    }

    //TODO: Use Completable once public API is released

    /**
     * Processes account picker or error result. Observable emits an item when the Picasa service is initialized.
     */
    public Observable<?> onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_ACCOUNT_PICKER) {
            if (resultCode == Activity.RESULT_OK) {
                String accountEmail = data.getStringExtra(AccountManager.KEY_ACCOUNT_NAME);
                mAccount = new Account(accountEmail, ACCOUNT_TYPE_GOOGLE);

                return retrieveTokenInitService();
            } else if (resultCode == Activity.RESULT_CANCELED) {
                //Select an account to add
                return Observable.error(new Exception("User canceled account picker dialog"));
            }
        } else if (requestCode == REQUEST_RECOVER_PLAY_SERVICES_ERROR && resultCode == Activity.RESULT_OK) {
            // Receiving a result that follows a GoogleAuthException, try auth again
            return retrieveTokenInitService();
        }

        return Observable.empty();
    }

    private boolean isDeviceOnline() {
        ConnectivityManager connMgr = (ConnectivityManager) mActivity.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    private Observable<?> retrieveTokenInitService() {
        if (isDeviceOnline()) {
            return Single.create(new Single.OnSubscribe<String>() {
                @Override
                public void call(SingleSubscriber<? super String> subscriber) {
                    try {
                        subscriber.onSuccess(GoogleAuthUtil.getToken(mActivity, mAccount, "oauth2:" + SCOPE_PICASA));
                    } catch (IOException | GoogleAuthException e) {
                        subscriber.onError(e);
                    }
                }
            }).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .doOnError(new Action1<Throwable>() {
                        @Override
                        public void call(Throwable error) {
                            if (error instanceof GooglePlayServicesAvailabilityException) {
                                int statusCode = ((GooglePlayServicesAvailabilityException) error)
                                        .getConnectionStatusCode();
                                Dialog dialog = GoogleApiAvailability.getInstance()
                                        .getErrorDialog(mActivity, statusCode, REQUEST_RECOVER_PLAY_SERVICES_ERROR);
                                dialog.show();
                            } else if (error instanceof UserRecoverableAuthException) {
                                Intent intent = ((UserRecoverableAuthException) error).getIntent();
                                mActivity.startActivityForResult(intent, REQUEST_RECOVER_PLAY_SERVICES_ERROR);
                            }
                        }
                    })
                    .doOnSuccess(new Action1<String>() {
                        @Override
                        public void call(String s) {
                            mOAuthToken = s;

                            initService();
                        }
                    })
                    .flatMapObservable(new Func1<String, Observable<?>>() {
                        @Override
                        public Observable<?> call(String s) {
                            return Observable.just(s);
                        }
                    });
        } else {
            return Observable.error(new Exception("Device not online."));
        }
    }

    public PicasaService getService() {
        return mPicasaService;
    }

    public Single<UserFeed> getUserFeed() {
        return mPicasaService.getUserFeedResponse()
                .map(new Func1<UserFeedResponse, UserFeed>() {
                    @Override
                    public UserFeed call(UserFeedResponse response) {
                        return response.getFeed();
                    }
                })
                .subscribeOn(Schedulers.io())
                .toSingle();
    }

    public Single<AlbumFeed> getAlbumFeed(long albumId) {
        return mPicasaService.getAlbumFeedResponse(albumId)
                .map(new Func1<AlbumFeedResponse, AlbumFeed>() {
                    @Override
                    public AlbumFeed call(AlbumFeedResponse response) {
                        return response.getFeed();
                    }
                })
                .subscribeOn(Schedulers.io())
                .toSingle();
    }

}
