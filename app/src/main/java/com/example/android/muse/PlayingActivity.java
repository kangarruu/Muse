package com.example.android.muse;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        // Locate the Toolbar to set it to act as the ActionBar
        Toolbar songsToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(songsToolbar);
        //enable up button functionality
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        //Get intent info from SongActivity
        Intent playingIntent = getIntent();
        if (getIntent().getExtras() != null) {
            //Get intent extra for the artist name of the currently playing song and set it on artist textView
            String current_artist = playingIntent.getStringExtra("current_artist");
            TextView artistName = this.findViewById(R.id.playing_artist_text_view);
            artistName.setText(current_artist);

            //Get intent extra for the name of the currently playing song and set it on song textView
            String current_song = playingIntent.getStringExtra("current_song");
            TextView songTitle = this.findViewById(R.id.playing_song_text_view);
            songTitle.setText(current_song);


        }

    }
    //Overriding the toolbar onSupportNavigateUp method learned from https://freakycoder.com/android-notes-24-how-to-add-back-button-at-toolbar-941e6577418e to enable up button
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
