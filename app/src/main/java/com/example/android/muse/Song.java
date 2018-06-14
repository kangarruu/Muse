package com.example.android.muse;

public class Song {
    //Name of the title of each song object
    private String mSongTitle;
    //Name of the artist of each song object
    private String mArtistName;
    //Drawable resource ID for song art/album cover for each song object;
    private int mImageResourceId;

    /** Create a new song object:
     * @param songTitle is the title of the song provided in the arrayList
     * @param artistName is the artist of the song that corresponds to the song
     * @param imageResourceId is drawable reference ID that corresponds to the song
     **/

    public Song(String songTitle, String artistName, int imageResourceId){
        mSongTitle = songTitle;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
    }

    public String getSongTitle(){
        return mSongTitle;
    }

    public void setSongTitle(String songName){
        mSongTitle = songName;
    }

    public String getArtistName(){
        return mArtistName;
    }

    public void setArtistName (String artistName){
        mArtistName = artistName;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public void setImageResourceId(int imageResourceId){ mImageResourceId = imageResourceId;}

}

