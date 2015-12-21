package com.pluscubed.picasaclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class AlbumFeed {

    @SerializedName("gphoto$bytesUsed")
    @Expose
    private SingleStringElement gphoto$bytesUsed;
    @SerializedName("subtitle")
    @Expose
    private SingleStringElement subtitle;
    @SerializedName("xmlns$exif")
    @Expose
    private String xmlns$exif;
    @SerializedName("gphoto$location")
    @Expose
    private SingleStringElement gphoto$location;
    @SerializedName("xmlns$georss")
    @Expose
    private String xmlns$georss;
    @SerializedName("openSearch$itemsPerPage")
    @Expose
    private SingleIntegerElement openSearch$itemsPerPage;
    @SerializedName("gphoto$name")
    @Expose
    private SingleStringElement gphoto$name;
    @SerializedName("id")
    @Expose
    private SingleStringElement id;
    @SerializedName("category")
    @Expose
    private List<Category> category = new ArrayList<Category>();
    @SerializedName("rights")
    @Expose
    private SingleStringElement rights;
    @SerializedName("generator")
    @Expose
    private Generator generator;
    @SerializedName("author")
    @Expose
    private List<Author> author = new ArrayList<Author>();
    @SerializedName("openSearch$startIndex")
    @Expose
    private SingleIntegerElement openSearch$startIndex;
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
    private SingleStringElement updated;
    @SerializedName("xmlns$gd")
    @Expose
    private String xmlns$gd;
    @SerializedName("xmlns$gphoto")
    @Expose
    private String xmlns$gphoto;
    @SerializedName("gphoto$user")
    @Expose
    private SingleStringElement gphoto$user;
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
    private SingleIntegerElement gphoto$numphotosremaining;
    @SerializedName("icon")
    @Expose
    private SingleStringElement icon;
    @SerializedName("gphoto$nickname")
    @Expose
    private SingleStringElement gphoto$nickname;
    @SerializedName("xmlns")
    @Expose
    private String xmlns;
    @SerializedName("openSearch$totalResults")
    @Expose
    private SingleIntegerElement openSearch$totalResults;
    @SerializedName("title")
    @Expose
    private SingleStringElement title;
    @SerializedName("gphoto$numphotos")
    @Expose
    private SingleIntegerElement gphoto$numphotos;
    @SerializedName("gphoto$access")
    @Expose
    private SingleStringElement gphoto$access;


    @SerializedName("entry")
    @Expose
    private List<PhotoEntry> photoEntries = new ArrayList<>();
    @SerializedName("gphoto$id")
    @Expose
    private SingleStringElement gphotoId;
    @SerializedName("gphoto$albumType")
    @Expose
    private SingleStringElement gphotoAlbumType;
    @SerializedName("gphoto$timestamp")
    @Expose
    private SingleStringElement gphotoTimestamp;
    @SerializedName("gphoto$allowPrints")
    @Expose
    private SingleStringElement gphotoAllowPrints;
    @SerializedName("gphoto$allowDownloads")
    @Expose
    private SingleStringElement gphotoAllowDownloads;

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

    public void setGphotoAlbumType(SingleStringElement gphotoAlbumType) {
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

    public boolean getGphotoAllowPrints() {
        return Boolean.parseBoolean(gphotoAllowPrints.getBody());
    }

    public void setGphotoAllowPrints(boolean gphotoAllowPrints) {
        this.gphotoAllowPrints.setBody(String.valueOf(gphotoAllowPrints));
    }

    public boolean getGphotoAllowDownloads() {
        return Boolean.parseBoolean(gphotoAllowDownloads.getBody());
    }

    public void setGphotoAllowDownloads(boolean gphotoAllowDownloads) {
        this.gphotoAllowDownloads.setBody(String.valueOf(gphotoAllowDownloads));
    }

    public long getGphotoId() {
        return Long.parseLong(gphotoId.getBody());
    }

    public void setGphotoId(SingleStringElement gphotoId) {
        this.gphotoId = gphotoId;
    }

    public SingleStringElement getGphoto$bytesUsed() {
        return gphoto$bytesUsed;
    }

    public void setGphoto$bytesUsed(SingleStringElement gphoto$bytesUsed) {
        this.gphoto$bytesUsed = gphoto$bytesUsed;
    }

    public SingleStringElement getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(SingleStringElement subtitle) {
        this.subtitle = subtitle;
    }

    public String getXmlns$exif() {
        return xmlns$exif;
    }

    public void setXmlns$exif(String xmlns$exif) {
        this.xmlns$exif = xmlns$exif;
    }

    public SingleStringElement getGphoto$location() {
        return gphoto$location;
    }

    public void setGphoto$location(SingleStringElement gphoto$location) {
        this.gphoto$location = gphoto$location;
    }

    public String getXmlns$georss() {
        return xmlns$georss;
    }

    public void setXmlns$georss(String xmlns$georss) {
        this.xmlns$georss = xmlns$georss;
    }

    public SingleIntegerElement getOpenSearch$itemsPerPage() {
        return openSearch$itemsPerPage;
    }

    public void setOpenSearch$itemsPerPage(SingleIntegerElement openSearch$itemsPerPage) {
        this.openSearch$itemsPerPage = openSearch$itemsPerPage;
    }

    public SingleStringElement getGphoto$name() {
        return gphoto$name;
    }

    public void setGphoto$name(SingleStringElement gphoto$name) {
        this.gphoto$name = gphoto$name;
    }

    public SingleStringElement getId() {
        return id;
    }

    public void setId(SingleStringElement id) {
        this.id = id;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public SingleStringElement getRights() {
        return rights;
    }

    public void setRights(SingleStringElement rights) {
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

    public SingleIntegerElement getOpenSearch$startIndex() {
        return openSearch$startIndex;
    }

    public void setOpenSearch$startIndex(SingleIntegerElement openSearch$startIndex) {
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

    public SingleStringElement getUpdated() {
        return updated;
    }

    public void setUpdated(SingleStringElement updated) {
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

    public SingleStringElement getGphoto$user() {
        return gphoto$user;
    }

    public void setGphoto$user(SingleStringElement gphoto$user) {
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

    public SingleIntegerElement getGphoto$numphotosremaining() {
        return gphoto$numphotosremaining;
    }

    public void setGphoto$numphotosremaining(SingleIntegerElement gphoto$numphotosremaining) {
        this.gphoto$numphotosremaining = gphoto$numphotosremaining;
    }

    public SingleStringElement getIcon() {
        return icon;
    }

    public void setIcon(SingleStringElement icon) {
        this.icon = icon;
    }

    public SingleStringElement getGphoto$nickname() {
        return gphoto$nickname;
    }

    public void setGphoto$nickname(SingleStringElement gphoto$nickname) {
        this.gphoto$nickname = gphoto$nickname;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public SingleIntegerElement getOpenSearch$totalResults() {
        return openSearch$totalResults;
    }

    public void setOpenSearch$totalResults(SingleIntegerElement openSearch$totalResults) {
        this.openSearch$totalResults = openSearch$totalResults;
    }

    public SingleIntegerElement getGphoto$numphotos() {
        return gphoto$numphotos;
    }

    public void setGphoto$numphotos(SingleIntegerElement gphoto$numphotos) {
        this.gphoto$numphotos = gphoto$numphotos;
    }

    public SingleStringElement getGphoto$access() {
        return gphoto$access;
    }

    public void setGphoto$access(SingleStringElement gphoto$access) {
        this.gphoto$access = gphoto$access;
    }

}
