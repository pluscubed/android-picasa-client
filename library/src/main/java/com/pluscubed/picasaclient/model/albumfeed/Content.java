package com.pluscubed.picasaclient.model.albumfeed;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Content {

    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("type")
    @Expose
    private String type;


    public String getSrc() {
        return src;
    }


    public void setSrc(String src) {
        this.src = src;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

}
