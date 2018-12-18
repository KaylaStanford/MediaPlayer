package com.example.android.mediaplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

 public class BassnectarPlaylist extends AppCompatActivity {

    @Override
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<songs> songsItems = new ArrayList<songs>();
        songsItems.add(new songs("Bassnectar", "Speakerbox",R.drawable.bassnectar));
        songsItems.add(new songs("Bassnectar", "Heavyweight Sound", R.drawable.bassnectar));
        songsItems.add(new songs("Bassnectar", "The MotherShip", R.drawable.bassnectar));
        songsItems.add(new songs("Bassnectar", "Other Worlds", R.drawable.bassnectar));
        songsItems.add(new songs("Bassnectar", "WHAT", R.drawable.bassnectar));

        SongsAdapter adapter = new SongsAdapter(this, songsItems);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

            }


    }
