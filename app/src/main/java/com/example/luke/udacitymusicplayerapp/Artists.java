package com.example.luke.udacitymusicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by Luke on 23.06.2017.
 */

public class Artists extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists);
        Button nowPlaying = (Button)findViewById(R.id.nowPlayingButton);
        nowPlaying.setOnClickListener(new View.OnClickListener(){

    @Override
     public void onClick(View view){
        Intent artistsIntent = new Intent (Artists.this, NowPlaying.class);
        startActivity(artistsIntent);
    }
        });
        Button buyMuscicButton = (Button)findViewById(R.id.buyMusicButton);
        buyMuscicButton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent buyMusicIntent = new Intent (Artists.this, BuyMusic.class);
            startActivity(buyMusicIntent);
        }
    });


    }
        public void back (View view){
            Intent backIntent = new Intent(Artists.this, MainActivity.class);
            startActivity(backIntent);
        }
}
