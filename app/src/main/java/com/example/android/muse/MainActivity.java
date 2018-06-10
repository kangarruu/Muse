package com.example.android.muse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AlbumAdapter adapter;
    private ArrayList<Album> albumArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a new album list
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album("Sample Album 1", "Sample Artist 1", R.drawable.sample_album));
        albums.add(new Album("Sample Album 2", "Sample Artist 2 ", R.drawable.sample_album));
        albums.add(new Album("Sample Album 3", "Sample Artist 3", R.drawable.sample_album));
        albums.add(new Album("Sample Album 4", "Sample Artist 4", R.drawable.sample_album));
        albums.add(new Album("Sample Album 5", "Sample Artist 5", R.drawable.sample_album));
        albums.add(new Album("Sample Album 6", "Sample Artist 6", R.drawable.sample_album));
        albums.add(new Album("Sample Album 7", "Sample Artist 7", R.drawable.sample_album));
        albums.add(new Album("Sample Album 8", "Sample Artist 8", R.drawable.sample_album));


        //Create a new AlbumAdapter and feed in the above ArrayList
        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        //Locate the RecyclerView in the layout file via FindViewById
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //Set the adapter on the RecyclerView
        recyclerView.setAdapter(adapter);

        //Create a new GridLayoutManager
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        //Set the GridLayoutManager as the RecyclerView LayoutManager
        recyclerView.setLayoutManager(layoutManager);
    }
}
