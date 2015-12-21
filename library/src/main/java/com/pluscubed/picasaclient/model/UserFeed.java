package com.pluscubed.picasaclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class UserFeed {

    @SerializedName("subtitle")
    @Expose
    private SingleStringElement subtitle;
    @SerializedName("gphoto$user")
    @Expose
    private SingleStringElement gphoto$user;
    @SerializedName("gphoto$maxPhotosPerAlbum")
    @Expose
    private SingleIntegerElement gphoto$maxPhotosPerAlbum;
    @SerializedName("openSearch$itemsPerPage")
    @Expose
    private SingleStringElement openSearch$itemsPerPage;
    @SerializedName("id")
    @Expose
    private SingleStringElement id;
    @SerializedName("category")
    @Expose
    private List<Category> category = new ArrayList<Category>();
    @SerializedName("generator")
    @Expose
    private Generator generator;
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
    @SerializedName("gphoto$nickname")
    @Expose
    private SingleStringElement gphoto$nickname;
    @SerializedName("link")
    @Expose
    private List<Link> link = new ArrayList<Link>();
    @SerializedName("xmlns$openSearch")
    @Expose
    private String xmlns$openSearch;
    @SerializedName("gphoto$quotacurrent")
    @Expose
    private SingleStringElement gphoto$quotacurrent;
    @SerializedName("icon")
    @Expose
    private SingleStringElement icon;
    @SerializedName("xmlns")
    @Expose
    private String xmlns;
    @SerializedName("openSearch$totalResults")
    @Expose
    private SingleIntegerElement openSearch$totalResults;
    @SerializedName("author")
    @Expose
    private List<Author> author = new ArrayList<Author>();
    @SerializedName("gphoto$quotalimit")
    @Expose
    private SingleStringElement gphoto$quotalimit;
    @SerializedName("gphoto$thumbnail")
    @Expose
    private SingleStringElement gphoto$thumbnail;


    @SerializedName("title")
    @Expose
    private SingleStringElement title;
    @SerializedName("entry")
    @Expose
    private List<AlbumEntry> albumEntries = new ArrayList<>();


    public String getTitle() {
        return title.getBody();
    }

    public void setTitle(SingleStringElement title) {
        this.title = title;
    }

    public List<AlbumEntry> getAlbumEntries() {
        return albumEntries;
    }

    public void setAlbumEntries(List<AlbumEntry> albumEntries) {
        this.albumEntries = albumEntries;
    }

    public SingleStringElement getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(SingleStringElement subtitle) {
        this.subtitle = subtitle;
    }

    public SingleStringElement getGphoto$user() {
        return gphoto$user;
    }

    public void setGphoto$user(SingleStringElement gphoto$user) {
        this.gphoto$user = gphoto$user;
    }

    public SingleIntegerElement getGphoto$maxPhotosPerAlbum() {
        return gphoto$maxPhotosPerAlbum;
    }

    public void setGphoto$maxPhotosPerAlbum(SingleIntegerElement gphoto$maxPhotosPerAlbum) {
        this.gphoto$maxPhotosPerAlbum = gphoto$maxPhotosPerAlbum;
    }

    public SingleStringElement getOpenSearch$itemsPerPage() {
        return openSearch$itemsPerPage;
    }

    public void setOpenSearch$itemsPerPage(SingleStringElement openSearch$itemsPerPage) {
        this.openSearch$itemsPerPage = openSearch$itemsPerPage;
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

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
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

    public SingleStringElement getGphoto$nickname() {
        return gphoto$nickname;
    }

    public void setGphoto$nickname(SingleStringElement gphoto$nickname) {
        this.gphoto$nickname = gphoto$nickname;
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

    public SingleStringElement getGphoto$quotacurrent() {
        return gphoto$quotacurrent;
    }

    public void setGphoto$quotacurrent(SingleStringElement gphoto$quotacurrent) {
        this.gphoto$quotacurrent = gphoto$quotacurrent;
    }

    public SingleStringElement getIcon() {
        return icon;
    }

    public void setIcon(SingleStringElement icon) {
        this.icon = icon;
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

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public SingleStringElement getGphoto$quotalimit() {
        return gphoto$quotalimit;
    }

    public void setGphoto$quotalimit(SingleStringElement gphoto$quotalimit) {
        this.gphoto$quotalimit = gphoto$quotalimit;
    }

    public SingleStringElement getGphoto$thumbnail() {
        return gphoto$thumbnail;
    }


    public void setGphoto$thumbnail(SingleStringElement gphoto$thumbnail) {
        this.gphoto$thumbnail = gphoto$thumbnail;
    }

}
