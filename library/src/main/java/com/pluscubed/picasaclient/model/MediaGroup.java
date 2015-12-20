package com.pluscubed.picasaclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class MediaGroup {

    @SerializedName("media$credit")
    @Expose
    private List<Media$credit> media$credit = new ArrayList<>();
    @SerializedName("media$title")
    @Expose
    private Media$title media$title;
    @SerializedName("media$thumbnail")
    @Expose
    private List<Media$thumbnail> media$thumbnail = new ArrayList<>();
    @SerializedName("media$keywords")
    @Expose
    private Media$keywords media$keywords;
    @SerializedName("media$description")
    @Expose
    private Media$description media$description;

    @SerializedName("media$content")
    @Expose
    private List<MediaContent> mediaContents = new ArrayList<>();

    /**
     * @return media contents
     */
    public List<MediaContent> getContents() {
        return mediaContents;
    }


    public List<Media$credit> getMedia$credit() {
        return media$credit;
    }


    public void setMedia$credit(List<Media$credit> media$credit) {
        this.media$credit = media$credit;
    }


    public Media$title getMedia$title() {
        return media$title;
    }


    public void setMedia$title(Media$title media$title) {
        this.media$title = media$title;
    }


    public void setMediaContents(List<MediaContent> mediaContents) {
        this.mediaContents = mediaContents;
    }


    public List<Media$thumbnail> getMedia$thumbnail() {
        return media$thumbnail;
    }


    public void setMedia$thumbnail(List<Media$thumbnail> media$thumbnail) {
        this.media$thumbnail = media$thumbnail;
    }


    public Media$keywords getMedia$keywords() {
        return media$keywords;
    }


    public void setMedia$keywords(Media$keywords media$keywords) {
        this.media$keywords = media$keywords;
    }


    public Media$description getMedia$description() {
        return media$description;
    }


    public void setMedia$description(Media$description media$description) {
        this.media$description = media$description;
    }

}
