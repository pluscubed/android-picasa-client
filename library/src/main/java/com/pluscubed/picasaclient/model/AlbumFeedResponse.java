package com.pluscubed.picasaclient.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AlbumFeedResponse {

    @SerializedName("feed")
    @Expose
    private AlbumFeed feed;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("encoding")
    @Expose
    private String encoding;


    public AlbumFeed getFeed() {
        return feed;
    }


    public void setFeed(AlbumFeed feed) {
        this.feed = feed;
    }


    public String getVersion() {
        return version;
    }


    public void setVersion(String version) {
        this.version = version;
    }


    public String getEncoding() {
        return encoding;
    }


    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

}
