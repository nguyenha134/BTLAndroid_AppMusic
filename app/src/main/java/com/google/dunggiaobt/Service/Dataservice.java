package com.google.dunggiaobt.Service;

import com.google.dunggiaobt.Model.Album;
import com.google.dunggiaobt.Model.Quangcao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Dataservice {

    @GET("songbanner.php")
    Call<List<Quangcao>> GetDataBanner();
    //truong
    @GET("albumhot.php")
    Call<List<Album>> GetAlbumHot();
    //Vu
    @GET("playlistforcurrentday.php")
    Call<List<MediaStore.Audio.Playlists>> GetPlaylistCurrentDay();
}
