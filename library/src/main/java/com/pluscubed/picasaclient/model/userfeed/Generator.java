package com.pluscubed.picasaclient.model.userfeed;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Generator {

    @SerializedName("$t")
    @Expose
    private String $t;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("uri")
    @Expose
    private String uri;


    public String get$t() {
        return $t;
    }


    public void set$t(String $t) {
        this.$t = $t;
    }


    public String getVersion() {
        return version;
    }


    public void setVersion(String version) {
        this.version = version;
    }


    public String getUri() {
        return uri;
    }


    public void setUri(String uri) {
        this.uri = uri;
    }

}
