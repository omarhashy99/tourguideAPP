package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Fdes extends AppCompatActivity {
    static int photo = 0 ;
    static String full  ;
    static String name  ;
    static boolean Artist ;
    static boolean playing = false ;
    static int VR = 0;
    private MediaPlayer mMediaPlayer;



    @Override
    protected void onStop() {
        super.onStop();
        Artist = false ;
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
            playing = false ;
            
        }
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fdes);



        TextView nameTxet = (TextView)findViewById(R.id.namexo);
        nameTxet.setText(name);

        TextView desText = (TextView)findViewById(R.id.desxo);
        desText.setText(full);

        ImageView imageView  = (ImageView) findViewById(R.id.imagexo);
        imageView.setImageResource(photo);

         final TextView location = (TextView)findViewById(R.id.location);
         final ImageView play =  (ImageView) findViewById(R.id.Play) ;
         final MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mMediaPlayer.release();
                playing = false ;
                play.setImageResource(R.drawable.baseline_play_circle_filled_black_24dp);
            }
        };

        if (Artist){
            location.setVisibility(View.GONE);

            play.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    if (!playing){
                        mMediaPlayer = MediaPlayer.create( getBaseContext() , VR);
                        mMediaPlayer.start();
                        play.setImageResource(R.drawable.pause);
                        playing = true ;
                        mMediaPlayer.setOnCompletionListener(mCompletionListener);
                    }
                    else {
                        mMediaPlayer.pause();
                        playing = false ;
                        play.setImageResource(R.drawable.baseline_play_circle_filled_black_24dp);
                    }

            }}); }
        else{
            play.setVisibility(View.GONE);
            location.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Creates an Intent that will load a map of San Francisco
                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+name);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });}

    }


}