package com.example.android.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by klene on 19.03.2018.
 */

public class RockActivity extends AppCompatActivity {
    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_for_song);

        ArrayList<Songs> songs = new ArrayList<Songs>();

        songs.add(new Songs(getString(R.string.rock_song_1),getString(R.string.rock_singer_1),R.drawable.music_icon));
        songs.add(new Songs(getString(R.string.rock_song_2),getString(R.string.rock_singer_2),R.drawable.music_icon));
        songs.add(new Songs(getString(R.string.rock_song_3),getString(R.string.rock_singer_3),R.drawable.music_icon));
        songs.add(new Songs(getString(R.string.rock_song_4),getString(R.string.rock_singer_4),R.drawable.music_icon));
        songs.add(new Songs(getString(R.string.rock_song_5),getString(R.string.rock_singer_5),R.drawable.music_icon));
        songs.add(new Songs(getString(R.string.rock_song_6),getString(R.string.rock_singer_6),R.drawable.music_icon));
        songs.add(new Songs(getString(R.string.rock_song_7),getString(R.string.rock_singer_7),R.drawable.music_icon));
        songs.add(new Songs(getString(R.string.rock_song_8),getString(R.string.rock_singer_8),R.drawable.music_icon));
        songs.add(new Songs(getString(R.string.rock_song_9),getString(R.string.rock_singer_9),R.drawable.music_icon));
        songs.add(new Songs(getString(R.string.rock_song_10),getString(R.string.rock_singer_10),R.drawable.music_icon));

        SongsAdapter adapter = new SongsAdapter(this,songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
