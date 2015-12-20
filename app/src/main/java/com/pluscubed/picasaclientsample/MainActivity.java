package com.pluscubed.picasaclientsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.pluscubed.picasaclient.PicasaClient;
import com.pluscubed.picasaclient.model.AlbumEntry;
import com.pluscubed.picasaclient.model.UserFeed;

import java.util.ArrayList;
import java.util.List;

import rx.SingleSubscriber;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;

public class MainActivity extends AppCompatActivity {

    private List<AlbumEntry> mEntries;
    private PicasaAdapter mAdapter;
    private SwipeRefreshLayout mRefreshLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEntries = new ArrayList<>();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mAdapter = new PicasaAdapter();
        recyclerView.setAdapter(mAdapter);
        GridLayoutManager manager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(manager);

        mRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        mRefreshLayout.setColorSchemeColors(ContextCompat.getColor(this, R.color.colorAccent));
        mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                reload();
            }
        });

        PicasaClient.get().attachActivity(this);

        PicasaClient.get().pickAccount();
    }

    private void reload() {
        PicasaClient.get().getFeed()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleSubscriber<UserFeed>() {
                    @Override
                    public void onSuccess(UserFeed feed) {
                        mEntries = feed.getAlbumEntries();

                        mAdapter.notifyDataSetChanged();

                        mRefreshLayout.setRefreshing(false);
                    }

                    @Override
                    public void onError(Throwable error) {
                        error.printStackTrace();
                    }
                });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        PicasaClient.get().onActivityResult(requestCode, resultCode, data)
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        mRefreshLayout.setRefreshing(true);
                    }
                })
                .subscribe(new Subscriber<Object>() {
                    @Override
                    public void onCompleted() {
                        reload();
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Object o) {

                    }
                });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        PicasaClient.get().detachActivity();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;
        TextView subtitle;

        public ViewHolder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.image);
            title = (TextView) itemView.findViewById(R.id.title);
            subtitle = (TextView) itemView.findViewById(R.id.subtitle);
        }
    }

    private class PicasaAdapter extends RecyclerView.Adapter<ViewHolder> {

        public PicasaAdapter() {
            super();
            setHasStableIds(true);
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
            View view = inflater.inflate(R.layout.list_item_entry, parent, false);

            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            AlbumEntry albumEntry = mEntries.get(position);

            Glide.with(MainActivity.this)
                    .load(albumEntry.getMediaGroup().getContents().get(0).getUrl())
                    .into(holder.image);

            holder.title.setText(albumEntry.getTitle());

            String gphotoAlbumType = albumEntry.getGphotoAlbumType();
            if (gphotoAlbumType != null) {
                switch (gphotoAlbumType) {
                    case AlbumEntry.TYPE_GOOGLE_PHOTOS:
                        gphotoAlbumType = getString(R.string.google_photos);
                        break;
                    case AlbumEntry.TYPE_GOOGLE_PLUS:
                        gphotoAlbumType = getString(R.string.google_plus);
                        break;
                }
            }
            holder.subtitle.setText(gphotoAlbumType);
        }

        @Override
        public int getItemCount() {
            return mEntries.size();
        }

        @Override
        public long getItemId(int position) {
            return mEntries.get(position).getGphotoId();
        }
    }
}
