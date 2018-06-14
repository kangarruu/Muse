package com.example.android.muse;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    private ArrayList<Song> songs;
    Context mContext;

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    /**
     * Override code received through code --> Override methods
     * Overriding getView method to provide new layout for the listView
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final View listItemView = getWorkingView(convertView);
        final ViewHolder viewHolder = getViewHolder(listItemView);
        //Get the Word object located at the current position in the list
        final Song currentSong = getItem(position);

        //Get the title associated with current Song object in the ArrayList and set it on the TextView stored in viewHolder
        viewHolder.title_text_view.setText(currentSong.getSongTitle());

        //Get the artist associated with the current Song object in the ArrayList and set it on the TextView stored in viewHolder
        viewHolder.artist_text_view.setText(currentSong.getArtistName());

        //Get the resource ID associated with current Song object and set it on the ImageView stored in viewHolder
        viewHolder.song_image_view.setImageResource(currentSong.getImageResourceId());
        //Set the ImageResourceID as a tag for passing in Parcelable extra in the SongActivity
        viewHolder.song_image_view.setTag(currentSong.getImageResourceId());


        //Return the list item layout for implementation by the ListView
        return listItemView;


    }

    //Method for recycling view or inflating a new one
    private View getWorkingView(final View convertView) {
        View workingView = null;
        if (null == convertView) {
            final Context context = getContext();
            final LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            workingView = inflater.inflate(R.layout.song_list_item, null);
        } else {
            workingView = convertView;
        }
        return workingView;
    }

    ////Added viewHolder in adapter learned via http://www.learn-android.com/2011/11/22/lots-of-lists-custom-adapter/3/
    /// Create a new ViewHolder to keep track of necessary references for optimized performance
    private static class ViewHolder {
        public TextView title_text_view;
        public TextView artist_text_view;
        public ImageView song_image_view;
    }

    private ViewHolder getViewHolder(final View workingView) {
        final Object tag = workingView.getTag();
        ViewHolder viewHolder = null;

        if (null == tag || !(tag instanceof ViewHolder)) {
            viewHolder = new ViewHolder();

            //Locate the TextView in the song_list_item.xml that holds the song title for Song object via findViewByID
            viewHolder.title_text_view = (TextView) workingView.findViewById(R.id.title_text_view);
            //Locate the TextView in the song_list_item_item.xml that holds the artist for the Song object via findViewByID
            viewHolder.artist_text_view = (TextView) workingView.findViewById(R.id.artist_text_view);
            //Locate the ImageView int the song_list_item_item.xml that holds the album/artist art for the Song Object
            viewHolder.song_image_view = (ImageView) workingView.findViewById(R.id.song_image_view);

            workingView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) tag;
        }
        return viewHolder;
    }

}
