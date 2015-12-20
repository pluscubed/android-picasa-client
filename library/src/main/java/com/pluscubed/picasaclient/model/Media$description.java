package com.pluscubed.picasaclient.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Media$description {

    @SerializedName("$t")
    @Expose
    private String $t;
    @SerializedName("type")
    @Expose
    private String type;


    public String get$t() {
        return $t;
    }


    public void set$t(String $t) {
        this.$t = $t;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

}
