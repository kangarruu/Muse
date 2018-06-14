package com.example.android.muse;

import android.os.Parcel;
import android.os.Parcelable;

//Learned how to add the Parcelable interface from here: http://www.vogella.com/tutorials/AndroidParcelable/article.html

public class Song implements Parcelable {
    //Name of the title of each song object
    private String mSongTitle;
    //Name of the artist of each song object
    private String mArtistName;
    //Drawable resource ID for song art/album cover for each song object;
    private int mImageResourceId;

    /**
     * Create a new song object:
     *
     * @param songTitle       is the title of the song provided in the arrayList
     * @param artistName      is the artist of the song that corresponds to the song
     * @param imageResourceId is drawable reference ID that corresponds to the song
     **/

    //Create a song constructor
    public Song(String songTitle, String artistName, int imageResourceId) {
        mSongTitle = songTitle;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
    }

    //For reconstructing the parceled data back into a Song object
    protected Song(Parcel in) {
        mSongTitle = in.readString();
        mArtistName = in.readString();
        mImageResourceId = in.readInt();
    }

    //Parcelable Creator method for implementing the interface
    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

    //Song getter and setter methods
    public String getSongTitle() {
        return mSongTitle;
    }

    public void setSongTitle(String songName) {
        mSongTitle = songName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public void setArtistName(String artistName) {
        mArtistName = artistName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        mImageResourceId = imageResourceId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mSongTitle);
        dest.writeString(mArtistName);
        dest.writeInt(mImageResourceId);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + mSongTitle + '\'' +
                ", artist='" + mArtistName + '\'' +
                ", cover='" + mImageResourceId + '\'' +
                '}';
    }
}

