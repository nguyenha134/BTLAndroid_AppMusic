package com.google.dunggiaobt.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.dunggiaobt.Model.Playlist;
import com.google.dunggiaobt.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PlaylistAdapter extends ArrayAdapter<Playlist> {
    public PlaylistAdapter(@NonNull Context context, int resource, @NonNull List<Playlist> objects) {
        super(context, resource, objects);
    }
    class ViewHolder{
        TextView txtTenplaylist;
        ImageView imgbackground,imgplaylist;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View converView, @NonNull ViewGroup parrent){
        ViewHolder viewHolder =null;
        if(converView == null){
            LayoutInflater inflater =LayoutInflater.from(getContext()) ;
            converView =inflater.inflate(R.layout.dong_playlist,null);
            viewHolder =new ViewHolder();
            viewHolder.txtTenplaylist =converView.findViewById(R.id.textviewplaylist);
            viewHolder.imgplaylist =converView.findViewById(R.id.imageviewplaylist);
            viewHolder.imgbackground =converView.findViewById(R.id.imageviewbgplaylist);
            converView.setTag(viewHolder);
        }
        else {
            viewHolder =(ViewHolder) converView.getTag();
        }
        Playlist playlist =getItem(position);
        Picasso.with(getContext()).load(playlist.getHinhtheloai()).into(viewHolder.imgbackground);
        Picasso.with(getContext()).load(playlist.getIdChude()).into(viewHolder.imgplaylist);
        viewHolder.txtTenplaylist.setText(playlist.getTenBai());
       return converView;
    }
}
