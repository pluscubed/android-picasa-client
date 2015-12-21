package com.pluscubed.picasaclient;


import com.pluscubed.picasaclient.model.AlbumFeedResponse;
import com.pluscubed.picasaclient.model.UserFeedResponse;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

public interface PicasaService {

    @GET("default")
    Observable<UserFeedResponse> getUserFeedResponse();

    @GET("default/albumid/{albumId}")
    Observable<AlbumFeedResponse> getAlbumFeedResponse(@Path("albumId") long albumId);

}
