package com.pluscubed.picasaclient.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MediaContent {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("medium")
    @Expose
    private String medium;
    @SerializedName("type")
    @Expose
    private String type;


    /**
     * @return URL
     */
    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public String getMedium() {
        return medium;
    }


    public void setMedium(String medium) {
        this.medium = medium;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

}
