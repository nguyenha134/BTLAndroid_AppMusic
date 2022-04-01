package com.google.dunggiaobt.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Playlist {
    @SerializedName("TheLoai")
    @Expose
    private String idTheLoai;
    @SerializedName("ChuDe")
    @Expose
    private  String idChude;
    @SerializedName("TenBaiHat")
    @Expose
    private  String TenBai;
    @SerializedName("Hinh Anh")
    @Expose
    private  String Hinhtheloai;

    public String getTenBai() {
        return TenBai;
    }

    public String getHinhtheloai() {
        return Hinhtheloai;
    }

    public String getIdChude() {
        return idChude;
    }

    public String getIdTheLoai() {
        return idTheLoai;
    }

    public void setHinhtheloai(String hinhtheloai) {
        Hinhtheloai = hinhtheloai;
    }

    public void setIdChude(String idChude) {
        this.idChude = idChude;
    }

    public void setIdTheLoai(String idTheLoai) {
        this.idTheLoai = idTheLoai;
    }

    public void setTenBai(String tenBai) {
        TenBai = tenBai;
    }
}

