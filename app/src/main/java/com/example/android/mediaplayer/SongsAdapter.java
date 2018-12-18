package com.example.android.mediaplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<songs> {

    public SongsAdapter(Context context, ArrayList<songs> songsItems) {
        super(context, 0, songsItems);
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        View listItemView = convertview;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.nowplaying, parent, false);
        }

        songs currentSong = getItem(position);

        TextView artistNameTextView = listItemView.findViewById(R.id.artist_name_view);
        artistNameTextView.setText(currentSong.getArtistName());

        TextView songNameTextView = listItemView.findViewById(R.id.song_name_view);
        songNameTextView.setText(currentSong.getArtistSong());

        ImageView artistImageImageView = listItemView.findViewById(R.id.artist_image_view);
        artistImageImageView.setImageResource(currentSong.getImageResourceId());

        return listItemView;


    }
}

