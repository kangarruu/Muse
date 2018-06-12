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

        //Resources used to learn about toolbars: https://developer.android.com/training/appbar/up-action
        // Set toolbar from layout file
        Toolbar playingToolbar = (Toolbar) findViewById(R.id.toolbar);
        //Get a support ActionBar corresponding to this toolbar
        ActionBar actBar = getSupportActionBar();
        //Enable the Up button
        if (actBar != null) {
            actBar.setDisplayHomeAsUpEnabled(true);
        }




    }
}
