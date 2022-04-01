package com.google.dunggiaobt.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.dunggiaobt.Model.Album;
import com.google.dunggiaobt.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AlbumAdapter_T extends  RecyclerView.Adapter{
    Context context;
    ArrayList<Album> mangalbum;

    public AlbumAdapter_T(Context context, ArrayList<Album> mangalbum) {
        this.context = context;
        this.mangalbum = mangalbum;
    }

int ii=0;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_album, parent, false);
//        imageViewalbum=view.findViewById(R.id.imageviewalbum);
//        txttenalbum=view.findViewById(R.id.txttenalbum);
//        txttencasialbum=view.findViewById(R.id.txtviewtencasialbum);

        ViewHolder viewHolder = new ViewHolder(view);
        //
        Picasso.with(context).load(mangalbum.get(ii).getHinhAlbum()).into(imageViewalbum);
        txttenalbum.setText(mangalbum.get(ii).getTenAlbum());
        txttencasialbum.setText(mangalbum.get(ii).getTencasiAlbum());
        ii++;
//        return new ViewHolder(view);

       return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    }
    @Override
    public int getItemCount() {
        return mangalbum.size();
    }
    ImageView imageViewalbum;
    TextView txttenalbum,txttencasialbum;
    public  class  ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewalbum=itemView.findViewById(R.id.imageviewalbum);
            txttenalbum=itemView.findViewById(R.id.txttenalbum);
            txttencasialbum=itemView.findViewById(R.id.txtviewtencasialbum);
        }
    }
}
