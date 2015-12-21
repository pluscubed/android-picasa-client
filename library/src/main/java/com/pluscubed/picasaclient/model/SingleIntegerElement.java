package com.pluscubed.picasaclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SingleIntegerElement {

    @SerializedName("$t")
    @Expose
    private int body;


    public int getBody() {
        return body;
    }


    public void setBody(int $t) {
        this.body = $t;
    }
}
