package com.example.android.music;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by klene on 20.03.2018.
 */

public class SongsAdapter  extends ArrayAdapter<Songs>{

    public SongsAdapter(Activity context, ArrayList<Songs> songs) {
        super(context,0,songs);
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_list,parent,false);
        }
        Songs currentSong = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        songTextView.setText(currentSong.getmSong());

        TextView singerTextView = (TextView) listItemView.findViewById(R.id.singer_text_view);
        singerTextView.setText(currentSong.getmSinger());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(currentSong.getmImageResourceId());

        return listItemView;
    }
}
