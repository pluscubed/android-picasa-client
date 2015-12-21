package com.pluscubed.picasaclient.model;

import android.support.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class AlbumEntry {

    public static final String TYPE_GOOGLE_PHOTOS = "InstantUpload";
    public static final String TYPE_GOOGLE_PLUS = "Buzz";
    public static final String TYPE_PROFILE_PHOTOS = "ProfilePhotos";
    public static final String TYPE_SCRAPBOOK = "ScrapBook";

    @SerializedName("category")
    @Expose
    private List<SingleStringElement> category = new ArrayList<>();
    @SerializedName("gphoto$access")
    @Expose
    private SingleStringElement gphoto$access;
    @SerializedName("updated")
    @Expose
    private SingleStringElement updated;
    @SerializedName("rights")
    @Expose
    private SingleStringElement rights;
    @SerializedName("gphoto$name")
    @Expose
    private SingleStringElement gphoto$name;
    @SerializedName("author")
    @Expose
    private List<SingleStringElement> author = new ArrayList<>();
    @SerializedName("gd$etag")
    @Expose
    private String gd$etag;
    @SerializedName("gphoto$user")
    @Expose
    private SingleStringElement gphoto$user;
    @SerializedName("gphoto$numphotos")
    @Expose
    private SingleIntegerElement gphoto$numphotos;
    @SerializedName("summary")
    @Expose
    private SingleStringElement summary;
    @SerializedName("gphoto$nickname")
    @Expose
    private SingleStringElement gphoto$nickname;
    @SerializedName("link")
    @Expose
    private List<SingleStringElement> link = new ArrayList<>();
    @SerializedName("published")
    @Expose
    private SingleStringElement published;
    @SerializedName("id")
    @Expose
    private SingleStringElement id;
    @SerializedName("gphoto$bytesUsed")
    @Expose
    private SingleStringElement gphoto$bytesUsed;
    @SerializedName("gphoto$location")
    @Expose
    private SingleStringElement gphoto$location;
    @SerializedName("gphoto$numphotosremaining")
    @Expose
    private SingleIntegerElement gphoto$numphotosremaining;
    @SerializedName("app$edited")
    @Expose
    private SingleStringElement app$edited;


    @SerializedName("gphoto$id")
    @Expose
    private SingleStringElement gphotoId;
    @SerializedName("media$group")
    @Expose
    private MediaGroup mediaGroup;
    @SerializedName("title")
    @Expose
    private SingleStringElement title;
    @SerializedName("gphoto$albumType")
    @Expose
    @Nullable
    private SingleStringElement gphotoAlbumType;
    @SerializedName("gphoto$timestamp")
    @Expose
    private SingleStringElement gphotoTimestamp;

    /**
     * @return media group
     */
    public MediaGroup getMediaGroup() {
        return mediaGroup;
    }

    public void setMediaGroup(MediaGroup mediaGroup) {
        this.mediaGroup = mediaGroup;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title.getBody();
    }

    public void setTitle(SingleStringElement title) {
        this.title = title;
    }

    /**
     * @return Gphoto ID
     */
    public long getGphotoId() {
        return Long.parseLong(gphotoId.getBody());
    }

    public void setGphotoId(SingleStringElement gphotoId) {
        this.gphotoId = gphotoId;
    }

    /**
     * @return Gphoto album type
     */
    @Nullable
    public String getGphotoAlbumType() {
        return gphotoAlbumType != null ? gphotoAlbumType.getBody() : null;
    }

    public void setGphotoAlbumType(@Nullable SingleStringElement gphotoAlbumType) {
        this.gphotoAlbumType = gphotoAlbumType;
    }

    /**
     * @return Gphoto timestamp
     */
    public long getGphotoTimestamp() {
        return Long.parseLong(gphotoTimestamp.getBody());
    }

    public void setGphotoTimestamp(long gphotoTimestamp) {
        this.gphotoTimestamp.setBody(String.valueOf(gphotoTimestamp));
    }

    public List<SingleStringElement> getCategory() {
        return category;
    }

    public void setCategory(List<SingleStringElement> category) {
        this.category = category;
    }

    public SingleStringElement getGphoto$access() {
        return gphoto$access;
    }

    public void setGphoto$access(SingleStringElement gphoto$access) {
        this.gphoto$access = gphoto$access;
    }

    public SingleStringElement getUpdated() {
        return updated;
    }

    public void setUpdated(SingleStringElement updated) {
        this.updated = updated;
    }

    public SingleStringElement getRights() {
        return rights;
    }

    public void setRights(SingleStringElement rights) {
        this.rights = rights;
    }

    public SingleStringElement getGphoto$name() {
        return gphoto$name;
    }

    public void setGphoto$name(SingleStringElement gphoto$name) {
        this.gphoto$name = gphoto$name;
    }

    public List<SingleStringElement> getAuthor() {
        return author;
    }

    public void setAuthor(List<SingleStringElement> author) {
        this.author = author;
    }

    public String getGd$etag() {
        return gd$etag;
    }

    public void setGd$etag(String gd$etag) {
        this.gd$etag = gd$etag;
    }

    public SingleStringElement getGphoto$user() {
        return gphoto$user;
    }

    public void setGphoto$user(SingleStringElement gphoto$user) {
        this.gphoto$user = gphoto$user;
    }

    public SingleIntegerElement getGphoto$numphotos() {
        return gphoto$numphotos;
    }

    public void setGphoto$numphotos(SingleIntegerElement gphoto$numphotos) {
        this.gphoto$numphotos = gphoto$numphotos;
    }

    public SingleStringElement getSummary() {
        return summary;
    }

    public void setSummary(SingleStringElement summary) {
        this.summary = summary;
    }

    public SingleStringElement getGphoto$nickname() {
        return gphoto$nickname;
    }

    public void setGphoto$nickname(SingleStringElement gphoto$nickname) {
        this.gphoto$nickname = gphoto$nickname;
    }

    public List<SingleStringElement> getLink() {
        return link;
    }

    public void setLink(List<SingleStringElement> link) {
        this.link = link;
    }

    public SingleStringElement getPublished() {
        return published;
    }

    public void setPublished(SingleStringElement published) {
        this.published = published;
    }

    public SingleStringElement getId() {
        return id;
    }


    public void setId(SingleStringElement id) {
        this.id = id;
    }


    public SingleStringElement getGphoto$bytesUsed() {
        return gphoto$bytesUsed;
    }


    public void setGphoto$bytesUsed(SingleStringElement gphoto$bytesUsed) {
        this.gphoto$bytesUsed = gphoto$bytesUsed;
    }


    public SingleStringElement getGphoto$location() {
        return gphoto$location;
    }


    public void setGphoto$location(SingleStringElement gphoto$location) {
        this.gphoto$location = gphoto$location;
    }


    public SingleIntegerElement getGphoto$numphotosremaining() {
        return gphoto$numphotosremaining;
    }


    public void setGphoto$numphotosremaining(SingleIntegerElement gphoto$numphotosremaining) {
        this.gphoto$numphotosremaining = gphoto$numphotosremaining;
    }


    public SingleStringElement getApp$edited() {
        return app$edited;
    }


    public void setApp$edited(SingleStringElement app$edited) {
        this.app$edited = app$edited;
    }

}
