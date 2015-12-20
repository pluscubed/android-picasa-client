package com.pluscubed.picasaclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class UserFeed {

    @SerializedName("subtitle")
    @Expose
    private Subtitle subtitle;
    @SerializedName("gphoto$user")
    @Expose
    private Gphoto$user gphoto$user;
    @SerializedName("gphoto$maxPhotosPerAlbum")
    @Expose
    private Gphoto$maxPhotosPerAlbum gphoto$maxPhotosPerAlbum;
    @SerializedName("openSearch$itemsPerPage")
    @Expose
    private OpenSearch$itemsPerPage openSearch$itemsPerPage;
    @SerializedName("id")
    @Expose
    private Id id;
    @SerializedName("category")
    @Expose
    private List<Category> category = new ArrayList<Category>();
    @SerializedName("generator")
    @Expose
    private Generator generator;
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
    @SerializedName("gphoto$nickname")
    @Expose
    private Gphoto$nickname gphoto$nickname;
    @SerializedName("link")
    @Expose
    private List<Link> link = new ArrayList<Link>();
    @SerializedName("xmlns$openSearch")
    @Expose
    private String xmlns$openSearch;
    @SerializedName("gphoto$quotacurrent")
    @Expose
    private Gphoto$quotacurrent gphoto$quotacurrent;
    @SerializedName("icon")
    @Expose
    private Icon icon;
    @SerializedName("xmlns")
    @Expose
    private String xmlns;
    @SerializedName("openSearch$totalResults")
    @Expose
    private OpenSearch$totalResults openSearch$totalResults;
    @SerializedName("author")
    @Expose
    private List<Author> author = new ArrayList<Author>();
    @SerializedName("gphoto$quotalimit")
    @Expose
    private Gphoto$quotalimit gphoto$quotalimit;
    @SerializedName("gphoto$thumbnail")
    @Expose
    private Gphoto$thumbnail gphoto$thumbnail;


    @SerializedName("title")
    @Expose
    private SingleBodyElement title;
    @SerializedName("entry")
    @Expose
    private List<AlbumEntry> albumEntries = new ArrayList<>();


    public String getTitle() {
        return title.getBody();
    }

    public void setTitle(SingleBodyElement title) {
        this.title = title;
    }

    public List<AlbumEntry> getAlbumEntries() {
        return albumEntries;
    }

    public void setAlbumEntries(List<AlbumEntry> albumEntries) {
        this.albumEntries = albumEntries;
    }

    public Subtitle getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
    }

    public Gphoto$user getGphoto$user() {
        return gphoto$user;
    }

    public void setGphoto$user(Gphoto$user gphoto$user) {
        this.gphoto$user = gphoto$user;
    }

    public Gphoto$maxPhotosPerAlbum getGphoto$maxPhotosPerAlbum() {
        return gphoto$maxPhotosPerAlbum;
    }

    public void setGphoto$maxPhotosPerAlbum(Gphoto$maxPhotosPerAlbum gphoto$maxPhotosPerAlbum) {
        this.gphoto$maxPhotosPerAlbum = gphoto$maxPhotosPerAlbum;
    }

    public OpenSearch$itemsPerPage getOpenSearch$itemsPerPage() {
        return openSearch$itemsPerPage;
    }

    public void setOpenSearch$itemsPerPage(OpenSearch$itemsPerPage openSearch$itemsPerPage) {
        this.openSearch$itemsPerPage = openSearch$itemsPerPage;
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

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
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

    public Gphoto$nickname getGphoto$nickname() {
        return gphoto$nickname;
    }

    public void setGphoto$nickname(Gphoto$nickname gphoto$nickname) {
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

    public Gphoto$quotacurrent getGphoto$quotacurrent() {
        return gphoto$quotacurrent;
    }

    public void setGphoto$quotacurrent(Gphoto$quotacurrent gphoto$quotacurrent) {
        this.gphoto$quotacurrent = gphoto$quotacurrent;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public OpenSearch$totalResults getOpenSearch$totalResults() {
        return openSearch$totalResults;
    }

    public void setOpenSearch$totalResults(OpenSearch$totalResults openSearch$totalResults) {
        this.openSearch$totalResults = openSearch$totalResults;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public Gphoto$quotalimit getGphoto$quotalimit() {
        return gphoto$quotalimit;
    }

    public void setGphoto$quotalimit(Gphoto$quotalimit gphoto$quotalimit) {
        this.gphoto$quotalimit = gphoto$quotalimit;
    }

    public Gphoto$thumbnail getGphoto$thumbnail() {
        return gphoto$thumbnail;
    }


    public void setGphoto$thumbnail(Gphoto$thumbnail gphoto$thumbnail) {
        this.gphoto$thumbnail = gphoto$thumbnail;
    }

}
