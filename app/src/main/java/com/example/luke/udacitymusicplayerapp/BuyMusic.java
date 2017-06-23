package com.example.luke.udacitymusicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Luke on 23.06.2017.
 */

public class BuyMusic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buymusic);

    Button artists = (Button)findViewById(R.id.artistsButton);
    artists.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view){
            Intent artistsIntent = new Intent (BuyMusic.this, Artists.class);
            startActivity(artistsIntent);
        }
    });
    Button nowPlayingButton = (Button)findViewById(R.id.nowPlayingButton);
    nowPlayingButton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent buyMusicIntent = new Intent (BuyMusic.this, NowPlaying.class);
            startActivity(buyMusicIntent);
        }
    });
        }
    public void back (View view){
        Intent backIntent = new Intent(BuyMusic.this, MainActivity.class);
        startActivity(backIntent);
    }
}