package com.pluscubed.picasaclient.model.userfeed;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class UserFeedResponse {

    @SerializedName("feed")
    @Expose
    private UserFeed feed;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("encoding")
    @Expose
    private String encoding;


    public UserFeed getFeed() {
        return feed;
    }


    public void setFeed(UserFeed feed) {
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
