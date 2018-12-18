package com.example.android.mediaplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GRiZ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<songs> songsItems = new ArrayList<songs>();
        songsItems.add(new songs("GRiZ", "Wicked", R.drawable.griz));
        songsItems.add(new songs("GRiZ", "Can't Get Enough", R.drawable.griz));
        songsItems.add(new songs("GRiZ", "Funk Party", R.drawable.griz));
        songsItems.add(new songs("GRiZ", "Before I Go",R.drawable.griz));
        songsItems.add(new songs("GRiZ", "Good Times Roll", R.drawable.griz));

        SongsAdapter adapter = new SongsAdapter(this, songsItems);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}

