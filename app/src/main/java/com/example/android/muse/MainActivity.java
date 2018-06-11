package com.example.android.muse;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

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
        final ArrayList<Album> albums = new ArrayList<>();
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

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Album album = albums.get(position);
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                    songsIntent.putExtra("artist_name", album.getArtistName());
                    songsIntent.putExtra("album_name", album.getAlbumName());
                    songsIntent.putExtra("resource_id", album.getImageResourceId());
                    MainActivity.this.startActivity(songsIntent);
            }

            @Override
            public void onLongClick(View view, int position)   {
            }
        }));
    }

    /*I learned how to implement the interface below (and above recyclerView.addOnItemTouchListener) using the following resources:
    *https://tutorialwing.com/android-recyclerview-tutorial-example/
    *https://medium.com/@harivigneshjayapalan/android-recyclerview-implementing-single-item-click-and-long-press-part-ii-b43ef8cb6ad8
    *https://www.androidhive.info/2016/01/android-working-with-recycler-view/
     */

    //Define the interface ClickListener
    public interface ClickListener{
        void onClick(View view, int position);
        void onLongClick(View view, int position);
    }

    //Implement RecyclerView.OnItemTouchListener to enable onclick
    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {
        private GestureDetector gestureDetector;
        private MainActivity.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final MainActivity.ClickListener clickListener){
            this.clickListener = clickListener;
            gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener(){
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

                @Override
                public void onLongPress(MotionEvent e) {
                    View child = recyclerView.findChildViewUnder(e.getX(),e.getY());
                    if (child != null && clickListener != null){
                        clickListener.onLongClick(child, recyclerView.getChildAdapterPosition(child));
                    }
                }
            });
        }

        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
            View child = rv.findChildViewUnder(e.getX(), e.getY());
            if (child!= null && clickListener != null && gestureDetector.onTouchEvent(e)){
                clickListener.onClick(child, rv.getChildAdapterPosition(child));
            }
            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e) {

        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

        }
    }

}

