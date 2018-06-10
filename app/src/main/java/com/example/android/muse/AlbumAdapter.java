package com.example.android.muse;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {
    //An ArrayList of type Album for the AlbumAdapter to use.
    private ArrayList<Album> albumArrayList;
    private Context mContext;

    //Calling the constructor and passing in our ArrayList and context
    public AlbumAdapter (Context mContext, ArrayList<Album> albumArrayList){
        this.albumArrayList = albumArrayList;
        this.mContext = mContext;
    }

    public class AlbumViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //Declaring the parent view, two TextViews and ImageView in the album_list_layout
        public TextView artist, album;
        public ImageView cover;
        RelativeLayout parentView;

        //Inflating the ViewHolder and locating the above Views via findViewByID
        public AlbumViewHolder(View itemView){
            super(itemView);
            artist = (TextView)itemView.findViewById(R.id.artist_text_view);
            album = (TextView)itemView.findViewById(R.id.album_text_view);
            cover = (ImageView)itemView.findViewById(R.id.artist_image_view);
            //Locate the parent RelativeLayout so we can later set an onClickListener on it
            parentView = (RelativeLayout) itemView.findViewById(R.id.album_parent_layout);
        }
        //Override the default onClick method
        @Override
        public void onClick(View v) {
        }
    }
    //Pass in the layout file for the ViewHolder to inflate the view
    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_list_item, parent, false);
        return new AlbumViewHolder(itemView);
    }
    //Bind the view to Album object in the current position
    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
        Album currentAlbum = albumArrayList.get(position);
        holder.artist.setText(currentAlbum.getArtistName());
        holder.album.setText(currentAlbum.getAlbumName());
        holder.cover.setImageResource(currentAlbum.getImageResourceId());
        holder.parentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, SongsActivity.class);
                mContext.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return albumArrayList.size();
    }

}