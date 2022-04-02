package com.google.dunggiaobt.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaiHat {
    @SerializedName("IdBaiHat")
    @Expose
    private String idbaihat;
    @SerializedName("TenBaiHat")
    @Expose
    private String tenbaihat;
    @SerializedName("CaSi")
    @Expose
    private String casi;
    @SerializedName("LinkBaiHat")
    @Expose
    private String linkbaihat;
    @SerializedName("Luotthich")
    @Expose
    private String luotthich;

    public String getCasi() {
        return casi;
    }

    public String getIdbaihat() {
        return idbaihat;
    }

    public String getLinkbaihat() {
        return linkbaihat;
    }

    public String getLuotthich() {
        return luotthich;
    }

    public String getTenbaihat() {
        return tenbaihat;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public void setIdbaihat(String idbaihat) {
        this.idbaihat = idbaihat;
    }

    public void setLinkbaihat(String linkbaihat) {
        this.linkbaihat = linkbaihat;
    }

    public void setLuotthich(String luotthich) {
        this.luotthich = luotthich;
    }

    public void setTenbaihat(String tenbaihat) {
        this.tenbaihat = tenbaihat;
    }
}
