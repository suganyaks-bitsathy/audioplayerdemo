package com.example.audioembedding;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button play;
    Button pause;
    Button stop;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=(Button)findViewById(R.id.button);
        pause=(Button)findViewById(R.id.button1);
        stop=(Button)findViewById(R.id.button2);

        play.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(mediaPlayer==null)
                        {
                            mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.iphonering);

                        }
                        mediaPlayer.start();
                    }
                }
        );

        pause.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (mediaPlayer!=null)
                            mediaPlayer.pause();

                    }
                }

        );

        stop.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(mediaPlayer!=null)
                            mediaPlayer.release();
                        mediaPlayer=null;
                    }
                }
        );

    }
}
