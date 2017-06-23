package com.example.luke.udacitymusicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent nowplayingIntent = new Intent(MainActivity.this, NowPlaying.class);

                // Start the new activity
                startActivity(nowplayingIntent);
            }
        });

        TextView artists = (TextView) findViewById(R.id.artist);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(artistsIntent);
            }
        });

        TextView buymusic = (TextView) findViewById(R.id.buymusic);
        buymusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyMusicIntent = new Intent(MainActivity.this, BuyMusic.class);
                startActivity(buyMusicIntent);
            }
        });
    }

}
