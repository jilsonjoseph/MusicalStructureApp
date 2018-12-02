package com.example.jilson.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        /* TextView object is created and onClickListener is set to the object
        *  Intent object i is used for starting next activity
        *  */
        TextView songsTextView = findViewById(R.id.songs_text_view);
        songsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),MainActivity.class);
                startActivity(i);
            }
        });

        /* TextView object is created and onClickListener is set to the object
        *  Intent object i is used for starting next activity
        *  */
        TextView albumsTextView = findViewById(R.id.albums_text_view);
        albumsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),AlbumsActivity.class);
                startActivity(i);
            }
        });

        /* TextView object is created and onClickListener is set to the object
        *  Intent object i is used for starting next activity
        *  */
        TextView artistsTextView = findViewById(R.id.artists_text_view);
        artistsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),ArtistsActivity.class);
                startActivity(i);
            }
        });

        /* TextView object is created and onClickListener is set to the object
        *  Intent object i is used for starting next activity
        *  */
        TextView generesTextView = findViewById(R.id.genres_text_view);
        generesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),GenresActivity.class);
                startActivity(i);
            }
        });

        /* TextView object is created and onClickListener is set to the object
        *  Intent object i is used for starting next activity
        *  */
        TextView nowPlayingTextView = findViewById(R.id.now_playing_text_view);
        nowPlayingTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),NowPlayingActivity.class);
                startActivity(i);
            }
        });
    }
}
