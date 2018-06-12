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
        int resource_id =  songsIntent.getIntExtra("resource_id", 0);

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
        ListView listView = findViewById(R.id.list_view);

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
            case "Sample Artist 6": {
                SongAdapter adapter = new SongAdapter(this, artist_6_songs);
                listView.setAdapter(adapter);
                break;
            }
            case "Sample Artist 7": {
                SongAdapter adapter = new SongAdapter(this, artist_7_songs);
                listView.setAdapter(adapter);
                break;
            }
            case "Sample Artist 8": {
                SongAdapter adapter = new SongAdapter(this, artist_8_songs);
                listView.setAdapter(adapter);
                break;
            }
        }



}}
