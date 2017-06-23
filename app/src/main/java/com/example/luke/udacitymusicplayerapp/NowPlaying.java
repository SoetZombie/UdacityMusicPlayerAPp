package com.example.luke.udacitymusicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by Luke on 22.06.2017.
 */

public class NowPlaying extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playingnow);

    Button artists = (Button)findViewById(R.id.artistsButton);
    artists.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view){
            Intent nowPlayingIntent = new Intent (NowPlaying.this, Artists.class);
            startActivity(nowPlayingIntent);
        }
    });
    Button buyMuscicButton = (Button)findViewById(R.id.buyMusicButton);
    buyMuscicButton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent nowPlayingIntent = new Intent (NowPlaying.this, BuyMusic.class);
            startActivity(nowPlayingIntent);
        }
    });
    }
    public void back (View view){
        Intent backIntent = new Intent(NowPlaying.this, MainActivity.class);
        startActivity(backIntent);
    }
}
