package com.pluscubed.picasaclient.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GmlPoint {

    @SerializedName("gml$pos")
    @Expose
    private SingleStringElement gmlPos;


    public SingleStringElement getGmlPos() {
        return gmlPos;
    }


    public void setGmlPos(SingleStringElement gmlPos) {
        this.gmlPos = gmlPos;
    }

}
