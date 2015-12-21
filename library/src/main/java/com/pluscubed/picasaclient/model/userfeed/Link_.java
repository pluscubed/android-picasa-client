package com.pluscubed.picasaclient.model.userfeed;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Link_ {

    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("rel")
    @Expose
    private String rel;


    public String getHref() {
        return href;
    }


    public void setHref(String href) {
        this.href = href;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getRel() {
        return rel;
    }


    public void setRel(String rel) {
        this.rel = rel;
    }

}
