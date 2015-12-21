package com.pluscubed.picasaclient.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Author {

    @SerializedName("name")
    @Expose
    private SingleStringElement name;
    @SerializedName("uri")
    @Expose
    private SingleStringElement uri;


    public SingleStringElement getName() {
        return name;
    }


    public void setName(SingleStringElement name) {
        this.name = name;
    }


    public SingleStringElement getUri() {
        return uri;
    }


    public void setUri(SingleStringElement uri) {
        this.uri = uri;
    }

}
