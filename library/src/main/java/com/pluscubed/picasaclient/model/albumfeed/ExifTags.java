package com.pluscubed.picasaclient.model.albumfeed;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.pluscubed.picasaclient.model.userfeed.SingleBodyElement;

/**
 * EXIF Tags
 */
public class ExifTags {

    @SerializedName("exif$fstop")
    @Expose
    private SingleBodyElement exifFstop;
    @SerializedName("exif$imageUniqueID")
    @Expose
    private SingleBodyElement exifImageUniqueID;
    @SerializedName("exif$model")
    @Expose
    private SingleBodyElement exifModel;
    @SerializedName("exif$make")
    @Expose
    private SingleBodyElement exifMake;
    @SerializedName("exif$iso")
    @Expose
    private SingleBodyElement exifIso;
    @SerializedName("exif$flash")
    @Expose
    private SingleBodyElement exifFlash;
    @SerializedName("exif$exposure")
    @Expose
    private SingleBodyElement exifExposure;
    @SerializedName("exif$time")
    @Expose
    private SingleBodyElement exifTime;
    @SerializedName("exif$focallength")
    @Expose
    private SingleBodyElement exifFocalLength;
    @SerializedName("exif$distance")
    @Expose
    private SingleBodyElement exifDistance;

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
