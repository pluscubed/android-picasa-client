package com.pluscubed.picasaclient;


import com.pluscubed.picasaclient.model.FeedResponse;

import retrofit.http.GET;
import rx.Observable;

public interface PicasaService {

    @GET("default")
    Observable<FeedResponse> getFeedResponse();

    /*@GET("default/albumid/{albumId}")
    Observable<PicasaResponse> getAlbumEntryResponse(@Path("albumId") String albumId);*/

}
