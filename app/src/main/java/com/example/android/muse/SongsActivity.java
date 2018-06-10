package com.example.android.muse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Create a new song list
        ArrayList<Song> artist_1_songs = new ArrayList<>();
        artist_1_songs.add(new Song("Sample Song 1", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 2", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 3", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 4", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 5", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 6", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 7", "Sample Artist 1", R.drawable.sample_album));
        artist_1_songs.add(new Song("Sample Song 8", "Sample Artist 1", R.drawable.sample_album));

        //Create a SongAdapter with the data source of songs
        SongAdapter adapter = new SongAdapter(this, artist_1_songs);
        //Find the ListView object in the SongsActivity layout file with the ID called list_view
        ListView listView = (ListView) findViewById(R.id.list_view);
        //Set the SongAdapter on the listView
        listView.setAdapter(adapter);


        //Create a new song list
        ArrayList<Song> artist_2_songs = new ArrayList<>();
        artist_2_songs.add(new Song("Sample Song 1", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 2", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 3", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 4", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 5", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 6", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 7", "Sample Artist 2", R.drawable.sample_album));
        artist_2_songs.add(new Song("Sample Song 8", "Sample Artist 2", R.drawable.sample_album));

        //Create a SongAdapter with the data source of artist_2_songs
        SongAdapter adapter2 = new SongAdapter(this, artist_2_songs);
        //Set the SongAdapter2 on the listView
        listView.setAdapter(adapter2);

    }

}
