package com.pluscubed.picasaclient.model.albumfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.pluscubed.picasaclient.model.userfeed.App$edited;
import com.pluscubed.picasaclient.model.userfeed.Category_;
import com.pluscubed.picasaclient.model.userfeed.Id_;
import com.pluscubed.picasaclient.model.userfeed.Link_;
import com.pluscubed.picasaclient.model.userfeed.MediaGroup;
import com.pluscubed.picasaclient.model.userfeed.Published;
import com.pluscubed.picasaclient.model.userfeed.SingleBodyElement;
import com.pluscubed.picasaclient.model.userfeed.Summary;
import com.pluscubed.picasaclient.model.userfeed.Updated_;

import java.util.ArrayList;
import java.util.List;


public class PhotoEntry {

    @SerializedName("gphoto$width")
    @Expose
    private SingleBodyElement gphotoWidth;
    @SerializedName("gphoto$height")
    @Expose
    private SingleBodyElement gphotoHeight;
    @SerializedName("id")
    @Expose
    private Id_ id;
    @SerializedName("category")
    @Expose
    private List<Category_> category = new ArrayList<>();
    @SerializedName("gphoto$license")
    @Expose
    private Gphoto$license gphoto$license;
    @SerializedName("title")
    @Expose
    private SingleBodyElement title;
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
    private List<Gphoto$streamId> gphoto$streamId = new ArrayList<>();
    @SerializedName("updated")
    @Expose
    private Updated_ updated;
    @SerializedName("gphoto$checksum")
    @Expose
    private Gphoto$checksum gphoto$checksum;
    @SerializedName("gphoto$size")
    @Expose
    private Gphoto$size gphoto$size;
    @SerializedName("link")
    @Expose
    private List<Link_> link = new ArrayList<Link_>();
    @SerializedName("app$edited")
    @Expose
    private App$edited app$edited;
    @SerializedName("gphoto$commentCount")
    @Expose
    private Gphoto$commentCount gphoto$commentCount;
    @SerializedName("gphoto$commentingEnabled")
    @Expose
    private Gphoto$commentingEnabled gphoto$commentingEnabled;
    @SerializedName("summary")
    @Expose
    private Summary summary;
    @SerializedName("gphoto$imageVersion")
    @Expose
    private Gphoto$imageVersion gphoto$imageVersion;
    @SerializedName("gphoto$access")
    @Expose
    private Gphoto$access_ gphoto$access;
    @SerializedName("published")
    @Expose
    private Published published;
    @SerializedName("georss$where")
    @Expose
    private Georss$where georss$where;

    @SerializedName("gphoto$id")
    @Expose
    private SingleBodyElement gphotoId;
    @SerializedName("media$group")
    @Expose
    private MediaGroup mediaGroup;
    @SerializedName("gphoto$albumid")
    @Expose
    private SingleBodyElement gphotoAlbumId;
    @SerializedName("exif$tags")
    @Expose
    private ExifTags exifTags;
    @SerializedName("gphoto$timestamp")
    @Expose
    private SingleBodyElement gphotoTimestamp;


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

    public void setGphotoAlbumId(SingleBodyElement gphotoAlbumId) {
        this.gphotoAlbumId = gphotoAlbumId;
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
     * @return Gphoto width
     */
    public int getGphotoWidth() {
        return Integer.parseInt(gphotoWidth.getBody());
    }

    public void setGphotoWidth(SingleBodyElement gphotoWidth) {
        this.gphotoWidth = gphotoWidth;
    }

    /**
     * @return Gphoto height
     */
    public int getGphotoHeight() {
        return Integer.parseInt(gphotoHeight.getBody());
    }

    public void setGphotoHeight(SingleBodyElement gphotoHeight) {
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

    public void setGphotoTimestamp(SingleBodyElement gphotoTimestamp) {
        this.gphotoTimestamp = gphotoTimestamp;
    }

    public Id_ getId() {
        return id;
    }

    public void setId(Id_ id) {
        this.id = id;
    }

    public List<Category_> getCategory() {
        return category;
    }

    public void setCategory(List<Category_> category) {
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

    public void setTitle(SingleBodyElement title) {
        this.title = title;
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

    public List<Gphoto$streamId> getGphoto$streamId() {
        return gphoto$streamId;
    }

    public void setGphoto$streamId(List<Gphoto$streamId> gphoto$streamId) {
        this.gphoto$streamId = gphoto$streamId;
    }

    public Updated_ getUpdated() {
        return updated;
    }

    public void setUpdated(Updated_ updated) {
        this.updated = updated;
    }

    public Gphoto$checksum getGphoto$checksum() {
        return gphoto$checksum;
    }

    public void setGphoto$checksum(Gphoto$checksum gphoto$checksum) {
        this.gphoto$checksum = gphoto$checksum;
    }

    public Gphoto$size getGphoto$size() {
        return gphoto$size;
    }

    public void setGphoto$size(Gphoto$size gphoto$size) {
        this.gphoto$size = gphoto$size;
    }

    public List<Link_> getLink() {
        return link;
    }

    public void setLink(List<Link_> link) {
        this.link = link;
    }

    public App$edited getApp$edited() {
        return app$edited;
    }

    public void setApp$edited(App$edited app$edited) {
        this.app$edited = app$edited;
    }

    public Gphoto$commentCount getGphoto$commentCount() {
        return gphoto$commentCount;
    }

    public void setGphoto$commentCount(Gphoto$commentCount gphoto$commentCount) {
        this.gphoto$commentCount = gphoto$commentCount;
    }

    public Gphoto$commentingEnabled getGphoto$commentingEnabled() {
        return gphoto$commentingEnabled;
    }

    public void setGphoto$commentingEnabled(Gphoto$commentingEnabled gphoto$commentingEnabled) {
        this.gphoto$commentingEnabled = gphoto$commentingEnabled;
    }

    public Summary getSummary() {
        return summary;
    }


    public void setSummary(Summary summary) {
        this.summary = summary;
    }


    public Gphoto$imageVersion getGphoto$imageVersion() {
        return gphoto$imageVersion;
    }


    public void setGphoto$imageVersion(Gphoto$imageVersion gphoto$imageVersion) {
        this.gphoto$imageVersion = gphoto$imageVersion;
    }


    public Gphoto$access_ getGphoto$access() {
        return gphoto$access;
    }


    public void setGphoto$access(Gphoto$access_ gphoto$access) {
        this.gphoto$access = gphoto$access;
    }


    public Published getPublished() {
        return published;
    }


    public void setPublished(Published published) {
        this.published = published;
    }


    public Georss$where getGeorss$where() {
        return georss$where;
    }


    public void setGeorss$where(Georss$where georss$where) {
        this.georss$where = georss$where;
    }

}
