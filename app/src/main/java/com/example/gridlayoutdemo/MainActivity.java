package com.example.gridlayoutdemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    int[] phrases = {R.raw.hello,R.raw.goodevening,R.raw.welcome,R.raw.howareyou,R.raw.please,R.raw.doyouspeakenglish,R.raw.mynameis,R.raw.ilivein};

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void playSound(View view) {
//        button = (Button) view;
//
//        int tagVal = Integer.parseInt(view.getTag().toString());
//
//        mediaPlayer = MediaPlayer.create(this,phrases[tagVal-1]);
//
//        mediaPlayer.start();
//    }

    public void playSound(View view ) {

        int id = view.getId();
        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.gridlayoutdemo");

        mediaPlayer = MediaPlayer.create(this,resourceId);
        mediaPlayer.start();

        Log.i("Button tapped", ourId);
    }
}
