package com.example.triflip;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    VideoView videoView;

    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        button = findViewById(R.id.button);
        videoView = findViewById(R.id.videoView1);
        Uri uri = Uri.parse("android.resource://"+
                getPackageName()+"/"+R.raw.vdo);
        videoView.setVideoURI(uri);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                startActi();
            }
        });
        videoView.start();




    }

    private void startActi() {
        if(isFinishing())
            return;
        Intent intent=new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
        finish();

    }

    public void button(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

    }
}