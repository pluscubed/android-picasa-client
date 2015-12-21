package com.pluscubed.picasaclient;

import com.pluscubed.picasaclient.model.albumfeed.AlbumFeed;
import com.pluscubed.picasaclient.model.userfeed.AlbumEntry;
import com.pluscubed.picasaclient.model.userfeed.UserFeed;

import rx.Single;
import rx.functions.Func1;

public class GphotosClient {

    public Single<AlbumFeed> getGphotosAlbumFeed() {
        return PicasaClient.get().getUserFeed()
                .flatMap(new Func1<UserFeed, Single<? extends AlbumFeed>>() {
                    @Override
                    public Single<? extends AlbumFeed> call(UserFeed userFeed) {
                        long id = -1;
                        for (AlbumEntry entry : userFeed.getAlbumEntries()) {
                            if (entry.getGphotoAlbumType().equals(AlbumEntry.TYPE_GOOGLE_PHOTOS)) {
                                id = entry.getGphotoId();
                            }
                        }

                        return PicasaClient.get().getAlbumFeed(id);
                    }
                });
    }
}
