package com.pluscubed.picasaclient.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SingleBodyElement {

    @SerializedName("$t")
    @Expose
    private String body;


    public String getBody() {
        return body;
    }


    public void setBody(String $t) {
        this.body = $t;
    }

}
