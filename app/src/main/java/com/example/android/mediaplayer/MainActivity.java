package com.example.android.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         TextView BassnectarPlaylist = findViewById(R.id.bassnectar_text_view);
        BassnectarPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BassnectarPlaylistIntent = new Intent(MainActivity.this, BassnectarPlaylist.class);
                startActivity(BassnectarPlaylistIntent);
            }
        });

         TextView gramatik = findViewById(R.id.gramatik_text_view);
        gramatik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gramatikIntent = new Intent(MainActivity.this, Gramatik.class);
                startActivity(gramatikIntent);
            }
        });

         TextView GRiZ = findViewById(R.id.griz_text_view);
        GRiZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GRiZIntent = new Intent(MainActivity.this, GRiZ.class);
                startActivity(GRiZIntent);
            }
        });
    }
}


