package com.google.dunggiaobt.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//vu
public class Playlist {
    private  String idPlaylist;
    private  String TenBai;
    private String hinhPlaylist;
    private  String Icon;

    public String getIdPlaylist() {
        return idPlaylist;
    }

    public void setTenBai(String tenBai) {
        TenBai = tenBai;
    }

    public String getTenBai() {
        return TenBai;
    }

    public String getHinhPlaylist() {
        return hinhPlaylist;
    }

    public void setHinhPlaylist(String hinhPlaylist) {
        this.hinhPlaylist = hinhPlaylist;
    }

    public void setIdPlaylist(String idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }

}

