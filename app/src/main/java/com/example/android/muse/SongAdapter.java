package com.example.android.muse;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs){
        super(context, 0, songs);
    }
    /**Override code acquired through code-->Override methods
     * Need to override the getView method and provide our own layout for the listView
     * @param position The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate. If view does not exist inflate a new one.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list_item, parent, false);
        }

        //Get the Word object located at the current position in the list
        Song currentSong = getItem(position);

        //Locate the TextView in the song_list_item.xmlm.xml that holds the song title for Song object via findViewByID
        TextView title_text_view = (TextView) listItemView.findViewById(R.id.title_text_view);
        //Get the title associated with current Song object in the ArrayList and set it on the TextView
        title_text_view.setText(currentSong.getSongTitle());

        //Locate the TextView in the song_list_item_item.xml that holds the artist for the Song object via findViewByID
        TextView artist_text_view = (TextView) listItemView.findViewById(R.id.artist_text_view);
        //Get the artist associated with the current Song object in the ArrayList and set it on the TextView
        artist_text_view.setText(currentSong.getArtistName());

        //Locate the ImageView int the song_list_item_item.xml that holds the album/artist art for the Song Object
        ImageView song_image_view = (ImageView) listItemView.findViewById(R.id.song_image_view);
        //Get the resource ID associated with current Song object and set it on the ImageView
        song_image_view.setImageResource(currentSong.getImageResourceId());

        //Return the list item layout for implementation by the ListView
        return listItemView;

    }



}
