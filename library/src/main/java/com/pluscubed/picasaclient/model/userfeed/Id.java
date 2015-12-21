package com.pluscubed.picasaclient.model.userfeed;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Id {

    @SerializedName("$t")
    @Expose
    private String $t;


    public String get$t() {
        return $t;
    }


    public void set$t(String $t) {
        this.$t = $t;
    }

}
