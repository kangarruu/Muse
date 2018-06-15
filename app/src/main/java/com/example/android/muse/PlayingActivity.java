package com.example.android.muse;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class PlayingActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        // Locate the Toolbar to set it to act as the ActionBar
        Toolbar songsToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(songsToolbar);
        //enable up button functionality
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        //Get intent info from SongActivity
        Intent playingIntent = getIntent();
        if (getIntent().getExtras() != null) {
            //Get Parcelable intent extra from SongActivity
            Song current_song = playingIntent.getParcelableExtra("Song_playing");

            // set on correct views
            TextView artistName = this.findViewById(R.id.playing_artist_text_view);
            artistName.setText(current_song.getArtistName());

            TextView songTitle = this.findViewById(R.id.playing_song_text_view);
            songTitle.setText(current_song.getSongTitle());

            ImageView cover = this.findViewById(R.id.playing_image_view);
            cover.setImageResource(current_song.getImageResourceId());
        }

        //Find the play button ImageViews via findViewByID
        ImageView playButton = this.findViewById(R.id.play_image_view);
        ImageView skipButton = this.findViewById(R.id.skip_image_view);
        ImageView rwdButton = this.findViewById(R.id.rwd_image_view);

        //Set onClickListeners on the views to display the toasts below
        playButton.setOnClickListener(this);
        skipButton.setOnClickListener(this);
        rwdButton.setOnClickListener(this);

      }

    //Overriding the toolbar onSupportNavigateUp method learned from https://freakycoder.com/android-notes-24-how-to-add-back-button-at-toolbar-941e6577418e to enable up button
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    //I learned this nifty way of overriding Toasts from here: https://codinginflow.com/tutorials/android/onclicklistener-for-multiple-buttons
    //and https://stackoverflow.com/questions/2755277/android-hide-all-shown-toast-messages
    @Override
    public void onClick(View v) {
        Toast clickedToast = Toast.makeText(this, " ", Toast.LENGTH_SHORT);
        switch(v.getId()){
            case R.id.play_image_view:
                clickedToast.setText("La La La La Laaaaa");
                clickedToast.show();
                break;
            case R.id.skip_image_view:
                clickedToast.setText("Oh hey, another song");
                clickedToast.show();
                break;
            case R.id.rwd_image_view:
                clickedToast.setText("Again! Again!");
                clickedToast.show();
                break;
        }

    }
}
