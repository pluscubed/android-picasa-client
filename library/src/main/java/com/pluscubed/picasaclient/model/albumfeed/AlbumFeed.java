package com.pluscubed.picasaclient.model.albumfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.pluscubed.picasaclient.model.userfeed.Author;
import com.pluscubed.picasaclient.model.userfeed.Category;
import com.pluscubed.picasaclient.model.userfeed.Generator;
import com.pluscubed.picasaclient.model.userfeed.Gphoto$access;
import com.pluscubed.picasaclient.model.userfeed.Gphoto$bytesUsed;
import com.pluscubed.picasaclient.model.userfeed.Gphoto$location;
import com.pluscubed.picasaclient.model.userfeed.Gphoto$name;
import com.pluscubed.picasaclient.model.userfeed.Gphoto$nickname;
import com.pluscubed.picasaclient.model.userfeed.Gphoto$numphotos;
import com.pluscubed.picasaclient.model.userfeed.Gphoto$numphotosremaining;
import com.pluscubed.picasaclient.model.userfeed.Gphoto$user;
import com.pluscubed.picasaclient.model.userfeed.Icon;
import com.pluscubed.picasaclient.model.userfeed.Id;
import com.pluscubed.picasaclient.model.userfeed.Link;
import com.pluscubed.picasaclient.model.userfeed.OpenSearch$itemsPerPage;
import com.pluscubed.picasaclient.model.userfeed.OpenSearch$startIndex;
import com.pluscubed.picasaclient.model.userfeed.OpenSearch$totalResults;
import com.pluscubed.picasaclient.model.userfeed.Rights;
import com.pluscubed.picasaclient.model.userfeed.SingleBodyElement;
import com.pluscubed.picasaclient.model.userfeed.Subtitle;
import com.pluscubed.picasaclient.model.userfeed.Updated;

import java.util.ArrayList;
import java.util.List;


public class AlbumFeed {

    @SerializedName("gphoto$bytesUsed")
    @Expose
    private Gphoto$bytesUsed gphoto$bytesUsed;
    @SerializedName("subtitle")
    @Expose
    private Subtitle subtitle;
    @SerializedName("xmlns$exif")
    @Expose
    private String xmlns$exif;
    @SerializedName("gphoto$location")
    @Expose
    private Gphoto$location gphoto$location;
    @SerializedName("xmlns$georss")
    @Expose
    private String xmlns$georss;
    @SerializedName("gphoto$allowPrints")
    @Expose
    private Gphoto$allowPrints gphoto$allowPrints;
    @SerializedName("openSearch$itemsPerPage")
    @Expose
    private OpenSearch$itemsPerPage openSearch$itemsPerPage;
    @SerializedName("gphoto$name")
    @Expose
    private Gphoto$name gphoto$name;
    @SerializedName("id")
    @Expose
    private Id id;
    @SerializedName("category")
    @Expose
    private List<Category> category = new ArrayList<Category>();
    @SerializedName("rights")
    @Expose
    private Rights rights;
    @SerializedName("generator")
    @Expose
    private Generator generator;
    @SerializedName("author")
    @Expose
    private List<Author> author = new ArrayList<Author>();
    @SerializedName("openSearch$startIndex")
    @Expose
    private OpenSearch$startIndex openSearch$startIndex;
    @SerializedName("xmlns$media")
    @Expose
    private String xmlns$media;
    @SerializedName("xmlns$app")
    @Expose
    private String xmlns$app;
    @SerializedName("gd$etag")
    @Expose
    private String gd$etag;
    @SerializedName("updated")
    @Expose
    private Updated updated;
    @SerializedName("xmlns$gd")
    @Expose
    private String xmlns$gd;
    @SerializedName("xmlns$gphoto")
    @Expose
    private String xmlns$gphoto;
    @SerializedName("gphoto$user")
    @Expose
    private Gphoto$user gphoto$user;
    @SerializedName("xmlns$gml")
    @Expose
    private String xmlns$gml;
    @SerializedName("link")
    @Expose
    private List<Link> link = new ArrayList<Link>();
    @SerializedName("xmlns$openSearch")
    @Expose
    private String xmlns$openSearch;
    @SerializedName("gphoto$numphotosremaining")
    @Expose
    private Gphoto$numphotosremaining gphoto$numphotosremaining;
    @SerializedName("icon")
    @Expose
    private Icon icon;
    @SerializedName("gphoto$nickname")
    @Expose
    private Gphoto$nickname gphoto$nickname;
    @SerializedName("xmlns")
    @Expose
    private String xmlns;
    @SerializedName("gphoto$allowDownloads")
    @Expose
    private Gphoto$allowDownloads gphoto$allowDownloads;
    @SerializedName("openSearch$totalResults")
    @Expose
    private OpenSearch$totalResults openSearch$totalResults;
    @SerializedName("title")
    @Expose
    private SingleBodyElement title;
    @SerializedName("gphoto$numphotos")
    @Expose
    private Gphoto$numphotos gphoto$numphotos;
    @SerializedName("gphoto$access")
    @Expose
    private Gphoto$access gphoto$access;


    @SerializedName("entry")
    @Expose
    private List<PhotoEntry> photoEntries = new ArrayList<>();
    @SerializedName("gphoto$id")
    @Expose
    private SingleBodyElement gphotoId;
    @SerializedName("gphoto$albumType")
    @Expose
    private SingleBodyElement gphotoAlbumType;
    @SerializedName("gphoto$timestamp")
    @Expose
    private SingleBodyElement gphotoTimestamp;

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
     * @return photo entries
     */
    public List<PhotoEntry> getPhotoEntries() {
        return photoEntries;
    }

    public void setPhotoEntries(List<PhotoEntry> photoEntries) {
        this.photoEntries = photoEntries;
    }

    /**
     * @return Gphoto album type
     */
    public String getGphotoAlbumType() {
        return gphotoAlbumType.getBody();
    }

    public void setGphotoAlbumType(SingleBodyElement gphotoAlbumType) {
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

    public long getGphotoId() {
        return Long.parseLong(gphotoId.getBody());
    }

    public void setGphotoId(SingleBodyElement gphotoId) {
        this.gphotoId = gphotoId;
    }

    public Gphoto$bytesUsed getGphoto$bytesUsed() {
        return gphoto$bytesUsed;
    }

    public void setGphoto$bytesUsed(Gphoto$bytesUsed gphoto$bytesUsed) {
        this.gphoto$bytesUsed = gphoto$bytesUsed;
    }

    public Subtitle getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
    }

    public String getXmlns$exif() {
        return xmlns$exif;
    }

    public void setXmlns$exif(String xmlns$exif) {
        this.xmlns$exif = xmlns$exif;
    }

    public Gphoto$location getGphoto$location() {
        return gphoto$location;
    }

    public void setGphoto$location(Gphoto$location gphoto$location) {
        this.gphoto$location = gphoto$location;
    }

    public String getXmlns$georss() {
        return xmlns$georss;
    }

    public void setXmlns$georss(String xmlns$georss) {
        this.xmlns$georss = xmlns$georss;
    }

    public Gphoto$allowPrints getGphoto$allowPrints() {
        return gphoto$allowPrints;
    }

    public void setGphoto$allowPrints(Gphoto$allowPrints gphoto$allowPrints) {
        this.gphoto$allowPrints = gphoto$allowPrints;
    }

    public OpenSearch$itemsPerPage getOpenSearch$itemsPerPage() {
        return openSearch$itemsPerPage;
    }

    public void setOpenSearch$itemsPerPage(OpenSearch$itemsPerPage openSearch$itemsPerPage) {
        this.openSearch$itemsPerPage = openSearch$itemsPerPage;
    }

    public Gphoto$name getGphoto$name() {
        return gphoto$name;
    }

    public void setGphoto$name(Gphoto$name gphoto$name) {
        this.gphoto$name = gphoto$name;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public Rights getRights() {
        return rights;
    }

    public void setRights(Rights rights) {
        this.rights = rights;
    }

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public OpenSearch$startIndex getOpenSearch$startIndex() {
        return openSearch$startIndex;
    }

    public void setOpenSearch$startIndex(OpenSearch$startIndex openSearch$startIndex) {
        this.openSearch$startIndex = openSearch$startIndex;
    }

    public String getXmlns$media() {
        return xmlns$media;
    }

    public void setXmlns$media(String xmlns$media) {
        this.xmlns$media = xmlns$media;
    }

    public String getXmlns$app() {
        return xmlns$app;
    }

    public void setXmlns$app(String xmlns$app) {
        this.xmlns$app = xmlns$app;
    }

    public String getGd$etag() {
        return gd$etag;
    }

    public void setGd$etag(String gd$etag) {
        this.gd$etag = gd$etag;
    }

    public Updated getUpdated() {
        return updated;
    }

    public void setUpdated(Updated updated) {
        this.updated = updated;
    }

    public String getXmlns$gd() {
        return xmlns$gd;
    }

    public void setXmlns$gd(String xmlns$gd) {
        this.xmlns$gd = xmlns$gd;
    }

    public String getXmlns$gphoto() {
        return xmlns$gphoto;
    }

    public void setXmlns$gphoto(String xmlns$gphoto) {
        this.xmlns$gphoto = xmlns$gphoto;
    }

    public Gphoto$user getGphoto$user() {
        return gphoto$user;
    }

    public void setGphoto$user(Gphoto$user gphoto$user) {
        this.gphoto$user = gphoto$user;
    }

    public String getXmlns$gml() {
        return xmlns$gml;
    }

    public void setXmlns$gml(String xmlns$gml) {
        this.xmlns$gml = xmlns$gml;
    }

    public List<Link> getLink() {
        return link;
    }

    public void setLink(List<Link> link) {
        this.link = link;
    }

    public String getXmlns$openSearch() {
        return xmlns$openSearch;
    }

    public void setXmlns$openSearch(String xmlns$openSearch) {
        this.xmlns$openSearch = xmlns$openSearch;
    }

    public Gphoto$numphotosremaining getGphoto$numphotosremaining() {
        return gphoto$numphotosremaining;
    }

    public void setGphoto$numphotosremaining(Gphoto$numphotosremaining gphoto$numphotosremaining) {
        this.gphoto$numphotosremaining = gphoto$numphotosremaining;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Gphoto$nickname getGphoto$nickname() {
        return gphoto$nickname;
    }

    public void setGphoto$nickname(Gphoto$nickname gphoto$nickname) {
        this.gphoto$nickname = gphoto$nickname;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public Gphoto$allowDownloads getGphoto$allowDownloads() {
        return gphoto$allowDownloads;
    }

    public void setGphoto$allowDownloads(Gphoto$allowDownloads gphoto$allowDownloads) {
        this.gphoto$allowDownloads = gphoto$allowDownloads;
    }

    public OpenSearch$totalResults getOpenSearch$totalResults() {
        return openSearch$totalResults;
    }

    public void setOpenSearch$totalResults(OpenSearch$totalResults openSearch$totalResults) {
        this.openSearch$totalResults = openSearch$totalResults;
    }

    public Gphoto$numphotos getGphoto$numphotos() {
        return gphoto$numphotos;
    }

    public void setGphoto$numphotos(Gphoto$numphotos gphoto$numphotos) {
        this.gphoto$numphotos = gphoto$numphotos;
    }

    public Gphoto$access getGphoto$access() {
        return gphoto$access;
    }

    public void setGphoto$access(Gphoto$access gphoto$access) {
        this.gphoto$access = gphoto$access;
    }

}
