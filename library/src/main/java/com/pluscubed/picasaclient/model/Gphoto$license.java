package com.pluscubed.picasaclient.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Gphoto$license {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("$t")
    @Expose
    private String $t;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public String get$t() {
        return $t;
    }


    public void set$t(String $t) {
        this.$t = $t;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

}
