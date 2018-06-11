package com.example.android.muse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        Intent songsIntent = getIntent();
        String artist = songsIntent.getStringExtra("artist_name");
        String album_name = songsIntent.getStringExtra("album_name");
        int resource_id =  songsIntent.getIntExtra("resource_id", 00);

        //Create a song lists corresponding to each album in the MainActivity
        ArrayList<Song> artist_1_songs = new ArrayList<>();
        artist_1_songs.add(new Song("Sample Song 1", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 2", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 3", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 4", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 5", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 6", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 7", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 8", "Sample Artist 1", R.drawable.sample_album));

        ArrayList<Song> artist_2_songs = new ArrayList<>();
        artist_2_songs.add(new Song("Sample Song 1", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 2", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 3", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 4", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 5", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 6", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 7", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 8", "Sample Artist 2", R.drawable.sample_album));

        ArrayList<Song> artist_3_songs = new ArrayList<>();
        artist_3_songs.add(new Song("Sample Song 1", "Sample Artist 3", R.drawable.sample_album));
        artist_3_songs.add(new Song("Sample Song 2", "Sample Artist 3", R.drawable.sample_album));
        artist_3_songs.add(new Song("Sample Song 3", "Sample Artist 3", R.drawable.sample_album));
        artist_3_songs.add(new Song("Sample Song 4", "Sample Artist 3", R.drawable.sample_album));
        artist_3_songs.add(new Song("Sample Song 5", "Sample Artist 3", R.drawable.sample_album));
        artist_3_songs.add(new Song("Sample Song 6", "Sample Artist 3", R.drawable.sample_album));
        artist_3_songs.add(new Song("Sample Song 7", "Sample Artist 3", R.drawable.sample_album));
        artist_3_songs.add(new Song("Sample Song 8", "Sample Artist 3", R.drawable.sample_album));

        ArrayList<Song> artist_4_songs = new ArrayList<>();
        artist_4_songs.add(new Song("Sample Song 1", "Sample Artist 4", R.drawable.sample_album));
        artist_4_songs.add(new Song("Sample Song 2", "Sample Artist 4", R.drawable.sample_album));
        artist_4_songs.add(new Song("Sample Song 3", "Sample Artist 4", R.drawable.sample_album));
        artist_4_songs.add(new Song("Sample Song 4", "Sample Artist 4", R.drawable.sample_album));
        artist_4_songs.add(new Song("Sample Song 5", "Sample Artist 4", R.drawable.sample_album));
        artist_4_songs.add(new Song("Sample Song 6", "Sample Artist 4", R.drawable.sample_album));
        artist_4_songs.add(new Song("Sample Song 7", "Sample Artist 4", R.drawable.sample_album));
        artist_4_songs.add(new Song("Sample Song 8", "Sample Artist 4", R.drawable.sample_album));

        ArrayList<Song> artist_5_songs = new ArrayList<>();
        artist_5_songs.add(new Song("Sample Song 1", "Sample Artist 5", R.drawable.sample_album));
        artist_5_songs.add(new Song("Sample Song 2", "Sample Artist 5", R.drawable.sample_album));
        artist_5_songs.add(new Song("Sample Song 3", "Sample Artist 5", R.drawable.sample_album));
        artist_5_songs.add(new Song("Sample Song 4", "Sample Artist 5", R.drawable.sample_album));
        artist_5_songs.add(new Song("Sample Song 5", "Sample Artist 5", R.drawable.sample_album));
        artist_5_songs.add(new Song("Sample Song 6", "Sample Artist 5", R.drawable.sample_album));
        artist_5_songs.add(new Song("Sample Song 7", "Sample Artist 5", R.drawable.sample_album));
        artist_5_songs.add(new Song("Sample Song 8", "Sample Artist 5", R.drawable.sample_album));

        ArrayList<Song> artist_6_songs = new ArrayList<>();
        artist_6_songs.add(new Song("Sample Song 1", "Sample Artist 6", R.drawable.sample_album));
        artist_6_songs.add(new Song("Sample Song 2", "Sample Artist 6", R.drawable.sample_album));
        artist_6_songs.add(new Song("Sample Song 3", "Sample Artist 6", R.drawable.sample_album));
        artist_6_songs.add(new Song("Sample Song 4", "Sample Artist 6", R.drawable.sample_album));
        artist_6_songs.add(new Song("Sample Song 5", "Sample Artist 6", R.drawable.sample_album));
        artist_6_songs.add(new Song("Sample Song 6", "Sample Artist 6", R.drawable.sample_album));
        artist_6_songs.add(new Song("Sample Song 7", "Sample Artist 6", R.drawable.sample_album));
        artist_6_songs.add(new Song("Sample Song 8", "Sample Artist 6", R.drawable.sample_album));

        ArrayList<Song> artist_7_songs = new ArrayList<>();
        artist_7_songs.add(new Song("Sample Song 1", "Sample Artist 7", R.drawable.sample_album));
        artist_7_songs.add(new Song("Sample Song 2", "Sample Artist 7", R.drawable.sample_album));
        artist_7_songs.add(new Song("Sample Song 3", "Sample Artist 7", R.drawable.sample_album));
        artist_7_songs.add(new Song("Sample Song 4", "Sample Artist 7", R.drawable.sample_album));
        artist_7_songs.add(new Song("Sample Song 5", "Sample Artist 7", R.drawable.sample_album));
        artist_7_songs.add(new Song("Sample Song 6", "Sample Artist 7", R.drawable.sample_album));
        artist_7_songs.add(new Song("Sample Song 7", "Sample Artist 7", R.drawable.sample_album));
        artist_7_songs.add(new Song("Sample Song 8", "Sample Artist 7", R.drawable.sample_album));

        ArrayList<Song> artist_8_songs = new ArrayList<>();
        artist_8_songs.add(new Song("Sample Song 1", "Sample Artist 8", R.drawable.sample_album));
        artist_8_songs.add(new Song("Sample Song 2", "Sample Artist 8", R.drawable.sample_album));
        artist_8_songs.add(new Song("Sample Song 3", "Sample Artist 8", R.drawable.sample_album));
        artist_8_songs.add(new Song("Sample Song 4", "Sample Artist 8", R.drawable.sample_album));
        artist_8_songs.add(new Song("Sample Song 5", "Sample Artist 8", R.drawable.sample_album));
        artist_8_songs.add(new Song("Sample Song 6", "Sample Artist 8", R.drawable.sample_album));
        artist_8_songs.add(new Song("Sample Song 7", "Sample Artist 8", R.drawable.sample_album));
        artist_8_songs.add(new Song("Sample Song 8", "Sample Artist 8", R.drawable.sample_album));

        //Find the ListView object in the SongsActivity layout file with the ID called list_view
        ListView listView = (ListView) findViewById(R.id.list_view);

        if (artist.equals("Sample Artist 1")) {
            SongAdapter adapter = new SongAdapter(this, artist_1_songs);
            //Set the SongAdapter on the listView
            listView.setAdapter(adapter);
        }   else if (artist.equals("Sample Artist 2")) {
            SongAdapter adapter = new SongAdapter(this, artist_2_songs);
            listView.setAdapter(adapter);
        }   else if (artist.equals("Sample Artist 3")) {
            SongAdapter adapter = new SongAdapter(this, artist_3_songs);
            listView.setAdapter(adapter);
        }    else if (artist.equals("Sample Artist 4")) {
            SongAdapter adapter = new SongAdapter(this, artist_4_songs);
            listView.setAdapter(adapter);
        }   else if (artist.equals("Sample Artist 5")) {
            SongAdapter adapter = new SongAdapter(this, artist_5_songs);
            listView.setAdapter(adapter);
        }   else if (artist.equals("Sample Artist 6")) {
            SongAdapter adapter = new SongAdapter(this, artist_6_songs);
            listView.setAdapter(adapter);
        }   else if (artist.equals("Sample Artist 7")) {
            SongAdapter adapter = new SongAdapter(this, artist_7_songs);
            listView.setAdapter(adapter);
        }   else if (artist.equals("Sample Artist 8")) {
            SongAdapter adapter = new SongAdapter(this, artist_8_songs);
            listView.setAdapter(adapter);
        }



}}
