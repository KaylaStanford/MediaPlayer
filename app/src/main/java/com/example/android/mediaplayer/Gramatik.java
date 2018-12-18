package com.example.android.mediaplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Gramatik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<songs> songsItems = new ArrayList <songs>();
        songsItems.add(new songs("Gramatik", "Just Jammin", R.drawable.gramatik));
        songsItems.add(new songs("Gramatik", "Hit That Jive", R.drawable.gramatik));
        songsItems.add(new songs("Gramatik", "Muy Tranquilo", R.drawable.gramatik));
        songsItems.add(new songs("Gramatik", "While I Was Playin' Fair",R.drawable.gramatik));

        SongsAdapter adapter = new SongsAdapter(this, songsItems);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
