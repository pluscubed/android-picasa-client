package com.pluscubed.picasaclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class PhotoEntry {

    @SerializedName("gphoto$width")
    @Expose
    private SingleStringElement gphotoWidth;
    @SerializedName("gphoto$height")
    @Expose
    private SingleStringElement gphotoHeight;
    @SerializedName("id")
    @Expose
    private SingleStringElement id;
    @SerializedName("category")
    @Expose
    private List<SingleStringElement> category = new ArrayList<>();
    @SerializedName("gphoto$license")
    @Expose
    private Gphoto$license gphoto$license;
    @SerializedName("title")
    @Expose
    private SingleStringElement title;
    @SerializedName("gphoto$shapes")
    @Expose
    private Gphoto$shapes gphoto$shapes;
    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("gd$etag")
    @Expose
    private String gd$etag;
    @SerializedName("gphoto$streamId")
    @Expose
    private List<SingleStringElement> gphotoStreamId = new ArrayList<>();
    @SerializedName("updated")
    @Expose
    private SingleStringElement updated;
    @SerializedName("gphoto$checksum")
    @Expose
    private SingleStringElement gphotoChecksum;
    @SerializedName("gphoto$size")
    @Expose
    private SingleStringElement gphotoSize;
    @SerializedName("link")
    @Expose
    private List<SingleStringElement> link = new ArrayList<>();
    @SerializedName("app$edited")
    @Expose
    private SingleStringElement app$edited;
    @SerializedName("gphoto$commentCount")
    @Expose
    private SingleIntegerElement gphoto$commentCount;
    @SerializedName("gphoto$commentingEnabled")
    @Expose
    private SingleStringElement gphotoCommentingEnabled;
    @SerializedName("summary")
    @Expose
    private SingleStringElement summary;
    @SerializedName("gphoto$imageVersion")
    @Expose
    private SingleStringElement gphotoImageVersion;
    @SerializedName("gphoto$access")
    @Expose
    private SingleStringElement gphotoAccess;
    @SerializedName("published")
    @Expose
    private SingleStringElement published;
    @SerializedName("georss$where")
    @Expose
    private Georss$where georss$where;

    @SerializedName("gphoto$id")
    @Expose
    private SingleStringElement gphotoId;
    @SerializedName("media$group")
    @Expose
    private MediaGroup mediaGroup;
    @SerializedName("gphoto$albumid")
    @Expose
    private SingleStringElement gphotoAlbumId;
    @SerializedName("exif$tags")
    @Expose
    private ExifTags exifTags;
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
     * @return Gphoto album ID
     */
    public long getGphotoAlbumId() {
        return Long.parseLong(gphotoAlbumId.getBody());
    }

    public void setGphotoAlbumId(SingleStringElement gphotoAlbumId) {
        this.gphotoAlbumId = gphotoAlbumId;
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
     * @return Gphoto width
     */
    public int getGphotoWidth() {
        return Integer.parseInt(gphotoWidth.getBody());
    }

    public void setGphotoWidth(SingleStringElement gphotoWidth) {
        this.gphotoWidth = gphotoWidth;
    }

    /**
     * @return Gphoto height
     */
    public int getGphotoHeight() {
        return Integer.parseInt(gphotoHeight.getBody());
    }

    public void setGphotoHeight(SingleStringElement gphotoHeight) {
        this.gphotoHeight = gphotoHeight;
    }

    /**
     * @return EXIF tags
     */
    public ExifTags getExifTags() {
        return exifTags;
    }

    public void setExifTags(ExifTags exifTags) {
        this.exifTags = exifTags;
    }

    /**
     * @return Gphoto timestamp
     */
    public long getGphotoTimestamp() {
        return Long.parseLong(gphotoTimestamp.getBody());
    }

    public void setGphotoTimestamp(SingleStringElement gphotoTimestamp) {
        this.gphotoTimestamp = gphotoTimestamp;
    }

    public SingleStringElement getId() {
        return id;
    }

    public void setId(SingleStringElement id) {
        this.id = id;
    }

    public List<SingleStringElement> getCategory() {
        return category;
    }

    public void setCategory(List<SingleStringElement> category) {
        this.category = category;
    }

    public Gphoto$license getGphoto$license() {
        return gphoto$license;
    }

    public void setGphoto$license(Gphoto$license gphoto$license) {
        this.gphoto$license = gphoto$license;
    }

    public String getTitle() {
        return title.getBody();
    }

    public void setTitle(String title) {
        this.title.setBody(title);
    }

    public Gphoto$shapes getGphoto$shapes() {
        return gphoto$shapes;
    }

    public void setGphoto$shapes(Gphoto$shapes gphoto$shapes) {
        this.gphoto$shapes = gphoto$shapes;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String getGd$etag() {
        return gd$etag;
    }

    public void setGd$etag(String gd$etag) {
        this.gd$etag = gd$etag;
    }

    public List<SingleStringElement> getGphotoStreamId() {
        return gphotoStreamId;
    }

    public void setGphotoStreamId(List<SingleStringElement> gphotoStreamId) {
        this.gphotoStreamId = gphotoStreamId;
    }

    public SingleStringElement getUpdated() {
        return updated;
    }

    public void setUpdated(SingleStringElement updated) {
        this.updated = updated;
    }

    public SingleStringElement getGphotoChecksum() {
        return gphotoChecksum;
    }

    public void setGphotoChecksum(SingleStringElement gphotoChecksum) {
        this.gphotoChecksum = gphotoChecksum;
    }

    public SingleStringElement getGphotoSize() {
        return gphotoSize;
    }

    public void setGphotoSize(SingleStringElement gphotoSize) {
        this.gphotoSize = gphotoSize;
    }

    public List<SingleStringElement> getLink() {
        return link;
    }

    public void setLink(List<SingleStringElement> link) {
        this.link = link;
    }

    public SingleStringElement getApp$edited() {
        return app$edited;
    }

    public void setApp$edited(SingleStringElement app$edited) {
        this.app$edited = app$edited;
    }

    public SingleIntegerElement getGphoto$commentCount() {
        return gphoto$commentCount;
    }

    public void setGphoto$commentCount(SingleIntegerElement gphoto$commentCount) {
        this.gphoto$commentCount = gphoto$commentCount;
    }

    public SingleStringElement getGphotoCommentingEnabled() {
        return gphotoCommentingEnabled;
    }

    public void setGphotoCommentingEnabled(SingleStringElement gphotoCommentingEnabled) {
        this.gphotoCommentingEnabled = gphotoCommentingEnabled;
    }

    public SingleStringElement getSummary() {
        return summary;
    }


    public void setSummary(SingleStringElement summary) {
        this.summary = summary;
    }


    public SingleStringElement getGphotoImageVersion() {
        return gphotoImageVersion;
    }


    public void setGphotoImageVersion(SingleStringElement gphotoImageVersion) {
        this.gphotoImageVersion = gphotoImageVersion;
    }


    public SingleStringElement getGphotoAccess() {
        return gphotoAccess;
    }


    public void setGphotoAccess(SingleStringElement gphotoAccess) {
        this.gphotoAccess = gphotoAccess;
    }


    public SingleStringElement getPublished() {
        return published;
    }


    public void setPublished(SingleStringElement published) {
        this.published = published;
    }


    public Georss$where getGeorss$where() {
        return georss$where;
    }


    public void setGeorss$where(Georss$where georss$where) {
        this.georss$where = georss$where;
    }

}
