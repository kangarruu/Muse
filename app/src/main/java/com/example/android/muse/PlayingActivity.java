package com.example.android.muse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;

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
        }





    }
}
