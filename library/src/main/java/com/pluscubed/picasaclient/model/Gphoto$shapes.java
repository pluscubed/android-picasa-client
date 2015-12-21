package com.pluscubed.picasaclient.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Gphoto$shapes {

    @SerializedName("faces")
    @Expose
    private String faces;


    public String getFaces() {
        return faces;
    }


    public void setFaces(String faces) {
        this.faces = faces;
    }

}
