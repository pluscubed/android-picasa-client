package com.pluscubed.picasaclient.model.albumfeed;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Gml$Point {

    @SerializedName("gml$pos")
    @Expose
    private Gml$pos gml$pos;


    public Gml$pos getGml$pos() {
        return gml$pos;
    }


    public void setGml$pos(Gml$pos gml$pos) {
        this.gml$pos = gml$pos;
    }

}
