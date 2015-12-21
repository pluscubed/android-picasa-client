package com.pluscubed.picasaclient.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * EXIF Tags
 */
public class ExifTags {

    @SerializedName("exif$fstop")
    @Expose
    private SingleStringElement exifFstop;
    @SerializedName("exif$imageUniqueID")
    @Expose
    private SingleStringElement exifImageUniqueID;
    @SerializedName("exif$model")
    @Expose
    private SingleStringElement exifModel;
    @SerializedName("exif$make")
    @Expose
    private SingleStringElement exifMake;
    @SerializedName("exif$iso")
    @Expose
    private SingleStringElement exifIso;
    @SerializedName("exif$flash")
    @Expose
    private SingleStringElement exifFlash;
    @SerializedName("exif$exposure")
    @Expose
    private SingleStringElement exifExposure;
    @SerializedName("exif$time")
    @Expose
    private SingleStringElement exifTime;
    @SerializedName("exif$focallength")
    @Expose
    private SingleStringElement exifFocalLength;
    @SerializedName("exif$distance")
    @Expose
    private SingleStringElement exifDistance;

    public double getExifDistance() {
        return exifDistance != null ? Double.parseDouble(exifDistance.getBody()) : -1;
    }


    public void setExifDistance(double exifDistance) {
        this.exifDistance.setBody(String.valueOf(exifDistance));
    }


    public double getExifFstop() {
        return exifFstop != null ? Double.parseDouble(exifFstop.getBody()) : -1;
    }


    public void setExifFstop(double exifFstop) {
        this.exifFstop.setBody(String.valueOf(exifFstop));
    }


    public String getExifImageUniqueID() {
        return exifImageUniqueID.getBody();
    }

    public void setExifImageUniqueID(String exifImageUniqueID) {
        this.exifImageUniqueID.setBody(exifImageUniqueID);
    }


    public String getExifModel() {
        return exifModel != null ? exifModel.getBody() : null;
    }


    public void setExifModel(String exifModel) {
        this.exifModel.setBody(exifModel);
    }


    public String getExifMake() {
        return exifMake != null ? exifMake.getBody() : null;
    }


    public void setExifMake(String exifMake) {
        this.exifMake.setBody(exifMake);
    }


    public int getExifIso() {
        return exifIso != null ? Integer.parseInt(exifIso.getBody()) : -1;
    }


    public void setExifIso(int exifIso) {
        this.exifIso.setBody(String.valueOf(exifIso));
    }


    public boolean getExifFlash() {
        return exifFlash != null && Boolean.parseBoolean(exifFlash.getBody());
    }


    public void setExifFlash(boolean exifFlash) {
        this.exifFlash.setBody(String.valueOf(exifFlash));
    }


    public double getExifExposure() {
        return exifExposure != null ? Double.parseDouble(exifExposure.getBody()) : -1;
    }


    public void setExifExposure(double exifExposure) {
        this.exifExposure.setBody(String.valueOf(exifExposure));
    }


    public long getExifTime() {
        return exifTime != null ? Long.parseLong(exifTime.getBody()) : -1;
    }


    public void setExifTime(long exifTime) {
        this.exifTime.setBody(String.valueOf(exifTime));
    }


    public double getExifFocalLength() {
        return exifFocalLength != null ? Double.parseDouble(exifFocalLength.getBody()) : -1;
    }


    public void setExifFocalLength(double exifFocalLength) {
        this.exifFocalLength.setBody(String.valueOf(exifFocalLength));
    }

}
