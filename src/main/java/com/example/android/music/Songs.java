package com.example.android.music;

/**
 * Created by klene on 20.03.2018.
 */

public class Songs {
    private  String mSong;
    private  String mSinger;
    private  int mImageResourceId;

    public Songs(String Song, String Singer, int imageResourceId){
        mSong = Song;
        mSinger = Singer;
        mImageResourceId = imageResourceId;
    }

    public String getmSong(){

        return  mSong;
    }

    public String getmSinger() {
        return  mSinger;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }
}
