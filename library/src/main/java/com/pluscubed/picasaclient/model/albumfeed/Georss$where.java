package com.pluscubed.picasaclient.model.albumfeed;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Georss$where {

    @SerializedName("gml$Point")
    @Expose
    private Gml$Point gml$Point;


    public Gml$Point getGml$Point() {
        return gml$Point;
    }


    public void setGml$Point(Gml$Point gml$Point) {
        this.gml$Point = gml$Point;
    }

}
