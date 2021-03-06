package com.example.android.muse;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Locate the Toolbar to set it to act as the ActionBar
        Toolbar songsToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(songsToolbar);
        //enable up button functionality
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        //Get intent extras from MainActivity
        Intent songsIntent = getIntent();
        final String artist = songsIntent.getStringExtra("artist_name");
        String album_name = songsIntent.getStringExtra("album_name");
        int resource_id = songsIntent.getIntExtra("resource_id", 0);

        //Create a song lists corresponding to each album in the MainActivity
        ArrayList<Song> artist_1_songs = new ArrayList<>();
        artist_1_songs.add(new Song("Moonlight", "Grace VanderWaal", R.drawable.grace_vanderwaal));
        artist_1_songs.add(new Song("Sick of Being Told", "Grace VanderWaal", R.drawable.grace_vanderwaal));
        artist_1_songs.add(new Song("Burned", "Grace VanderWaal", R.drawable.grace_vanderwaal));
        artist_1_songs.add(new Song("Just a Crush", "Grace VanderWaal", R.drawable.grace_vanderwaal));
        artist_1_songs.add(new Song("So Much More Than This", "Grace VanderWaal", R.drawable.grace_vanderwaal));
        artist_1_songs.add(new Song("Escape My Mind", "Grace VanderWaal", R.drawable.grace_vanderwaal));
        artist_1_songs.add(new Song("Talk Good", "Grace VanderWaal", R.drawable.grace_vanderwaal));
        artist_1_songs.add(new Song("Florets", "Grace VanderWaal", R.drawable.grace_vanderwaal));
        artist_1_songs.add(new Song("Insane Sometimes", "Grace VanderWaal", R.drawable.grace_vanderwaal));
        artist_1_songs.add(new Song("A Better Life", "Grace VanderWaal", R.drawable.grace_vanderwaal));
        artist_1_songs.add(new Song("City Song", "Grace VanderWaal", R.drawable.grace_vanderwaal));
        artist_1_songs.add(new Song("Darkness Keeps Chasing Me", "Grace VanderWaal", R.drawable.grace_vanderwaal));

        ArrayList<Song> artist_2_songs = new ArrayList<>();
        artist_2_songs.add(new Song("Hello", "Adele", R.drawable.adele));
        artist_2_songs.add(new Song("Send My Love", "Adele", R.drawable.adele));
        artist_2_songs.add(new Song("I Miss You", "Adele", R.drawable.adele));
        artist_2_songs.add(new Song("When We Were Young", "Adele", R.drawable.adele));
        artist_2_songs.add(new Song("Remedy", "Adele", R.drawable.adele));
        artist_2_songs.add(new Song("Water Under the Bridge", "Adele", R.drawable.adele));
        artist_2_songs.add(new Song("Love in the Dark", "Adele", R.drawable.adele));
        artist_2_songs.add(new Song("Million Years Ago", "Adele", R.drawable.adele));
        artist_2_songs.add(new Song("All I Ask", "Adele", R.drawable.adele));

        ArrayList<Song> artist_3_songs = new ArrayList<>();
        artist_3_songs.add(new Song("What's It Feel Like to Be a Ghost?", "Taking Back Sunday", R.drawable.taking_back_sunday));
        artist_3_songs.add(new Song("Liar (It Takes One To Know One)", "Taking Back Sunday", R.drawable.taking_back_sunday));
        artist_3_songs.add(new Song("MakeDamnSure", "Taking Back Sunday", R.drawable.taking_back_sunday));
        artist_3_songs.add(new Song("Up Against (Blackout)", "Taking Back Sunday", R.drawable.taking_back_sunday));
        artist_3_songs.add(new Song("My Blue Heaven", "Taking Back Sunday", R.drawable.taking_back_sunday));
        artist_3_songs.add(new Song("Twenty-Twenty Surgery", "Taking Back Sunday", R.drawable.taking_back_sunday));
        artist_3_songs.add(new Song("Spin", "Taking Back Sunday", R.drawable.taking_back_sunday));
        artist_3_songs.add(new Song("Divine Intervention", "Taking Back Sunday", R.drawable.taking_back_sunday));
        artist_3_songs.add(new Song("Miami", "Taking Back Sunday", R.drawable.taking_back_sunday));
        artist_3_songs.add(new Song("Error: Operator", "Taking Back Sunday", R.drawable.taking_back_sunday));
        artist_3_songs.add(new Song("I'll Let You Live", "Taking Back Sunday", R.drawable.taking_back_sunday));

        ArrayList<Song> artist_4_songs = new ArrayList<>();
        artist_4_songs.add(new Song("Always in My Head", "Coldplay", R.drawable.coldplay));
        artist_4_songs.add(new Song("Magic", "Coldplay", R.drawable.coldplay));
        artist_4_songs.add(new Song("Ink", "Coldplay", R.drawable.coldplay));
        artist_4_songs.add(new Song("True Love", "Coldplay", R.drawable.coldplay));
        artist_4_songs.add(new Song("Midnight", "Coldplay", R.drawable.coldplay));
        artist_4_songs.add(new Song("Another's Arms", "Coldplay", R.drawable.coldplay));
        artist_4_songs.add(new Song("Oceans", "Coldplay", R.drawable.coldplay));
        artist_4_songs.add(new Song("A Sky Full of Stars", "Coldplay", R.drawable.coldplay));
        artist_4_songs.add(new Song("O", "Coldplay", R.drawable.coldplay));

        ArrayList<Song> artist_5_songs = new ArrayList<>();
        artist_5_songs.add(new Song("Vices", "Brand New", R.drawable.brand_new));
        artist_5_songs.add(new Song("Bed", "Brand New", R.drawable.brand_new));
        artist_5_songs.add(new Song("At the Bottom", "Brand New", R.drawable.brand_new));
        artist_5_songs.add(new Song("Gasoline", "Brand New", R.drawable.brand_new));
        artist_5_songs.add(new Song("You Stole", "Brand New", R.drawable.brand_new));
        artist_5_songs.add(new Song("Be Gone", "Brand New", R.drawable.brand_new));
        artist_5_songs.add(new Song("Sink", "Brand New", R.drawable.brand_new));
        artist_5_songs.add(new Song("Bought a Bride", "Brand New", R.drawable.brand_new));
        artist_5_songs.add(new Song("Daisy", "Brand New", R.drawable.brand_new));
        artist_5_songs.add(new Song("In a Jar", "Brand New", R.drawable.brand_new));
        artist_5_songs.add(new Song("Noro", "Brand New", R.drawable.brand_new));

        ArrayList<Song> artist_6_songs = new ArrayList<>();
        artist_6_songs.add(new Song("Oats We Sow", "Gregory and the Hawk", R.drawable.gregory_and_the_hawk));
        artist_6_songs.add(new Song("August Moon", "Gregory and the Hawk", R.drawable.gregory_and_the_hawk));
        artist_6_songs.add(new Song("Doubtful", "Gregory and the Hawk", R.drawable.gregory_and_the_hawk));
        artist_6_songs.add(new Song("Grey Weather", "Gregory and the Hawk", R.drawable.gregory_and_the_hawk));
        artist_6_songs.add(new Song("Voice Like a Bell", "Gregory and the Hawk", R.drawable.gregory_and_the_hawk));
        artist_6_songs.add(new Song("Wild West", "Gregory and the Hawk", R.drawable.gregory_and_the_hawk));
        artist_6_songs.add(new Song("Stonewall, Stone Fence", "Gregory and the Hawk", R.drawable.gregory_and_the_hawk));
        artist_6_songs.add(new Song("Ghost", "Gregory and the Hawk", R.drawable.gregory_and_the_hawk));

        ArrayList<Song> artist_7_songs = new ArrayList<>();
        artist_7_songs.add(new Song("Name for You", "The Shins", R.drawable.the_shins));
        artist_7_songs.add(new Song("Painting a Hole", "The Shins", R.drawable.the_shins));
        artist_7_songs.add(new Song("Cherry Hearts", "The Shins", R.drawable.the_shins));
        artist_7_songs.add(new Song("Fantasy Island", "The Shins", R.drawable.the_shins));
        artist_7_songs.add(new Song("Mildenhall", "The Shins", R.drawable.the_shins));
        artist_7_songs.add(new Song("Rubber Ballz", "The Shins", R.drawable.the_shins));
        artist_7_songs.add(new Song("Half a Million", "The Shins", R.drawable.the_shins));
        artist_7_songs.add(new Song("Dead Alive", "The Shins", R.drawable.the_shins));

        ArrayList<Song> artist_8_songs = new ArrayList<>();
        artist_8_songs.add(new Song("Green Light", "Melodrama", R.drawable.lorde));
        artist_8_songs.add(new Song("Sober", "Melodrama", R.drawable.lorde));
        artist_8_songs.add(new Song("Homemade Dynamite", "Melodrama", R.drawable.lorde));
        artist_8_songs.add(new Song("The Louvre", "Melodrama", R.drawable.lorde));
        artist_8_songs.add(new Song("Liability", "Melodrama", R.drawable.lorde));
        artist_8_songs.add(new Song("Hard Feelings/Loveless", "Melodrama", R.drawable.lorde));
        artist_8_songs.add(new Song("Sober II (Melodrama)", "Melodrama", R.drawable.lorde));
        artist_8_songs.add(new Song("Writer in the Dark", "Melodrama", R.drawable.lorde));

        //Find the ListView object in the SongsActivity layout file with the ID called list_view
        final ListView listView = findViewById(R.id.list_view);
        //Set an OnItemClickListener to open up currently playing song
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //find the TextView with the name artist_text_view and set it's current contents to a String to pass as a param in the object Parcelable
                TextView artistName = view.findViewById(R.id.artist_text_view);
                String artist = artistName.getText().toString();

                //find the TextView with the name title_text_view and set it's current contents to a String to pass as a param in the object Parcelable
                TextView songTitle = view.findViewById(R.id.title_text_view);
                String currentSong = songTitle.getText().toString();

                //find the ImageView with the name song_image_view and set it's tag to pass as a param in the object Parceable
                //Learned how to assign a tag and pass it as an extra from these resources: https://stackoverflow.com/questions/32530156/how-to-get-image-id-from-listview
                //https://stackoverflow.com/questions/17393508/how-to-get-the-drawable-name-from-my-image-in-a-list-view-android
                ImageView cover = view.findViewById(R.id.song_image_view);
                int coverTag = (int) cover.getTag();

                //Create new intent to start PlayingActivity and pass current song details
                Intent playingIntent = new Intent(SongsActivity.this, PlayingActivity.class);
                if (getIntent() != null) {
                    playingIntent.putExtra("Song_playing", new Song(artist, currentSong, coverTag));
                }
                SongsActivity.this.startActivity(playingIntent);
            }
        });

        //Check if which artist name matches the intent extra, and set corresponding ArrayList of songs
        switch (artist.trim()) {
            case "Grace VanderWaal": {
                //Create new adapter, @param AlbumArray that corresponds to the right album
                SongAdapter adapter = new SongAdapter(this, artist_1_songs);
                //Set the SongAdapter on the listView
                listView.setAdapter(adapter);
                break;
            }
            case "Adele": {
                SongAdapter adapter = new SongAdapter(this, artist_2_songs);
                listView.setAdapter(adapter);
                break;
            }
            case "Taking Back Sunday": {
                SongAdapter adapter = new SongAdapter(this, artist_3_songs);
                listView.setAdapter(adapter);
                break;
            }
            case "Coldplay": {
                SongAdapter adapter = new SongAdapter(this, artist_4_songs);
                listView.setAdapter(adapter);
                break;
            }
            case "Brand New": {
                SongAdapter adapter = new SongAdapter(this, artist_5_songs);
                listView.setAdapter(adapter);
                break;
            }
            case "Gregory and the Hawk": {
                SongAdapter adapter = new SongAdapter(this, artist_6_songs);
                listView.setAdapter(adapter);
                break;
            }
            case "The Shins": {
                SongAdapter adapter = new SongAdapter(this, artist_7_songs);
                listView.setAdapter(adapter);
                break;
            }
            case "Lorde": {
                SongAdapter adapter = new SongAdapter(this, artist_8_songs);
                listView.setAdapter(adapter);
                break;
            }
        }
    }
}
