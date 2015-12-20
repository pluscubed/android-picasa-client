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
    private List<Category_> category = new ArrayList<Category_>();
    @SerializedName("gphoto$access")
    @Expose
    private Gphoto$access gphoto$access;
    @SerializedName("updated")
    @Expose
    private Updated_ updated;
    @SerializedName("rights")
    @Expose
    private Rights rights;
    @SerializedName("gphoto$name")
    @Expose
    private Gphoto$name gphoto$name;
    @SerializedName("author")
    @Expose
    private List<Author_> author = new ArrayList<Author_>();
    @SerializedName("gd$etag")
    @Expose
    private String gd$etag;
    @SerializedName("gphoto$user")
    @Expose
    private Gphoto$user_ gphoto$user;
    @SerializedName("gphoto$numphotos")
    @Expose
    private Gphoto$numphotos gphoto$numphotos;
    @SerializedName("summary")
    @Expose
    private Summary summary;
    @SerializedName("gphoto$nickname")
    @Expose
    private Gphoto$nickname_ gphoto$nickname;
    @SerializedName("gphoto$timestamp")
    @Expose
    private Gphoto$timestamp gphoto$timestamp;
    @SerializedName("link")
    @Expose
    private List<Link_> link = new ArrayList<Link_>();
    @SerializedName("published")
    @Expose
    private Published published;
    @SerializedName("id")
    @Expose
    private Id_ id;
    @SerializedName("gphoto$bytesUsed")
    @Expose
    private Gphoto$bytesUsed gphoto$bytesUsed;
    @SerializedName("gphoto$location")
    @Expose
    private Gphoto$location gphoto$location;
    @SerializedName("gphoto$numphotosremaining")
    @Expose
    private Gphoto$numphotosremaining gphoto$numphotosremaining;
    @SerializedName("app$edited")
    @Expose
    private App$edited app$edited;


    @SerializedName("gphoto$id")
    @Expose
    private SingleBodyElement gphotoId;
    @SerializedName("media$group")
    @Expose
    private MediaGroup mediaGroup;
    @SerializedName("title")
    @Expose
    private SingleBodyElement title;
    @SerializedName("gphoto$albumType")
    @Expose
    @Nullable
    private SingleBodyElement gphotoAlbumType;

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

    public void setTitle(SingleBodyElement title) {
        this.title = title;
    }

    /**
     * @return Gphoto ID
     */
    public long getGphotoId() {
        return Long.parseLong(gphotoId.getBody());
    }

    public void setGphotoId(SingleBodyElement gphotoId) {
        this.gphotoId = gphotoId;
    }

    /**
     * @return Gphoto album type
     */
    @Nullable
    public String getGphotoAlbumType() {
        return gphotoAlbumType != null ? gphotoAlbumType.getBody() : null;
    }

    public void setGphotoAlbumType(SingleBodyElement gphotoAlbumType) {
        this.gphotoAlbumType = gphotoAlbumType;
    }

    public List<Category_> getCategory() {
        return category;
    }

    public void setCategory(List<Category_> category) {
        this.category = category;
    }

    public Gphoto$access getGphoto$access() {
        return gphoto$access;
    }

    public void setGphoto$access(Gphoto$access gphoto$access) {
        this.gphoto$access = gphoto$access;
    }

    public Updated_ getUpdated() {
        return updated;
    }

    public void setUpdated(Updated_ updated) {
        this.updated = updated;
    }

    public Rights getRights() {
        return rights;
    }

    public void setRights(Rights rights) {
        this.rights = rights;
    }

    public Gphoto$name getGphoto$name() {
        return gphoto$name;
    }

    public void setGphoto$name(Gphoto$name gphoto$name) {
        this.gphoto$name = gphoto$name;
    }

    public List<Author_> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author_> author) {
        this.author = author;
    }

    public String getGd$etag() {
        return gd$etag;
    }

    public void setGd$etag(String gd$etag) {
        this.gd$etag = gd$etag;
    }

    public Gphoto$user_ getGphoto$user() {
        return gphoto$user;
    }

    public void setGphoto$user(Gphoto$user_ gphoto$user) {
        this.gphoto$user = gphoto$user;
    }

    public Gphoto$numphotos getGphoto$numphotos() {
        return gphoto$numphotos;
    }

    public void setGphoto$numphotos(Gphoto$numphotos gphoto$numphotos) {
        this.gphoto$numphotos = gphoto$numphotos;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public Gphoto$nickname_ getGphoto$nickname() {
        return gphoto$nickname;
    }

    public void setGphoto$nickname(Gphoto$nickname_ gphoto$nickname) {
        this.gphoto$nickname = gphoto$nickname;
    }

    public Gphoto$timestamp getGphoto$timestamp() {
        return gphoto$timestamp;
    }

    public void setGphoto$timestamp(Gphoto$timestamp gphoto$timestamp) {
        this.gphoto$timestamp = gphoto$timestamp;
    }

    public List<Link_> getLink() {
        return link;
    }

    public void setLink(List<Link_> link) {
        this.link = link;
    }

    public Published getPublished() {
        return published;
    }

    public void setPublished(Published published) {
        this.published = published;
    }

    public Id_ getId() {
        return id;
    }


    public void setId(Id_ id) {
        this.id = id;
    }


    public Gphoto$bytesUsed getGphoto$bytesUsed() {
        return gphoto$bytesUsed;
    }


    public void setGphoto$bytesUsed(Gphoto$bytesUsed gphoto$bytesUsed) {
        this.gphoto$bytesUsed = gphoto$bytesUsed;
    }


    public Gphoto$location getGphoto$location() {
        return gphoto$location;
    }


    public void setGphoto$location(Gphoto$location gphoto$location) {
        this.gphoto$location = gphoto$location;
    }


    public Gphoto$numphotosremaining getGphoto$numphotosremaining() {
        return gphoto$numphotosremaining;
    }


    public void setGphoto$numphotosremaining(Gphoto$numphotosremaining gphoto$numphotosremaining) {
        this.gphoto$numphotosremaining = gphoto$numphotosremaining;
    }


    public App$edited getApp$edited() {
        return app$edited;
    }


    public void setApp$edited(App$edited app$edited) {
        this.app$edited = app$edited;
    }

}
