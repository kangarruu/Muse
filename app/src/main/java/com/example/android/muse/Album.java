package com.example.android.muse;

public class Album {
    //Name of each album object
    private String mAlbumName;
    //Name of the artist of each album object
    private String mArtistName;
    //Drawable resource ID for album cover for each album object;
    private int mImageResourceId;

    /** Create a new album object:
     * @param albumName is the title of the album provided in the arrayList
     * @param artistName is the artist of the album that corresponds to the album
     * @param imageResourceId is drawable reference ID that corresponds to the song
     **/

    public Album(String albumName, String artistName, int imageResourceId){
        mAlbumName = albumName;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
    }

    public String getAlbumName(){

        return mAlbumName;
    }

    public void setAlbumName(String albumName){
        mAlbumName = albumName;
    }

    public String getArtistName(){

        return mArtistName;
    }

    public void setArtistName(String artistName){
        mArtistName = artistName;
    }


    public int getImageResourceId(){

        return mImageResourceId;
    }

    public void setImageResourceId(int imageResourceId){
        mImageResourceId = imageResourceId;
    }
}

