package com.pluscubed.picasaclient.model.userfeed;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Author_ {

    @SerializedName("name")
    @Expose
    private Name_ name;
    @SerializedName("uri")
    @Expose
    private Uri_ uri;


    public Name_ getName() {
        return name;
    }


    public void setName(Name_ name) {
        this.name = name;
    }


    public Uri_ getUri() {
        return uri;
    }


    public void setUri(Uri_ uri) {
        this.uri = uri;
    }

}
