package com.google.dunggiaobt.Fragment;

import static android.view.View.*;

import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.dunggiaobt.Adapter.PlaylistAdapter;
import com.google.dunggiaobt.Model.Playlist;
import com.google.dunggiaobt.R;
import com.google.dunggiaobt.Service.APIService;
import com.google.dunggiaobt.Service.Dataservice;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_PLaylist extends Fragment {
    View view;
    ListView lvpLaylist;
    TextView txtviewxemtiepplaylist;
    ArrayList<Playlist> mangplaylist;
    PlaylistAdapter playlistAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_playlist,container,false);
        lvpLaylist= view.findViewById(R.id.listviewplaylist);
        txtviewxemtiepplaylist = view.findViewById(R.id.textviewviewmoreplaylist);
        GetData();
        return view;
    }

    private void GetData() {
        Dataservice dataservice = APIService.getService();
        Call<List<Playlist>> callback = dataservice.GetPlaylistCurrentDay();
        callback.enqueue((new Callback<List<Playlist>>() {
            @Override
            public void onResponse(Call<List<Playlist>> call, Response<List<Playlist>> response) {
                mangplaylist =(ArrayList<Playlist>)response.body();
               playlistAdapter = new PlaylistAdapter(getActivity(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,mangplaylist);
                lvpLaylist.setAdapter(playlistAdapter);
            }

            @Override
            public void onFailure(Call<List<Playlist>> call, Throwable t) {

            }
        }));
    }
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }

        int totalHeight = 0;
        int desiredWidth = MeasureSpec.makeMeasureSpec(listView.getWidth(),
                MeasureSpec.AT_MOST);
        Log.w("DESIRED WIDTH", String.valueOf(listAdapter.getCount()));
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(desiredWidth, MeasureSpec.UNSPECIFIED);
            totalHeight += listItem.getMeasuredHeight();
            Log.w("HEIGHT"+i, String.valueOf(totalHeight));
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }
}
