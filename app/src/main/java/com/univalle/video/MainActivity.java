package com.univalle.video;


import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.net.Uri;
import android.widget.VideoView;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {
    public VideoView video1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video1 = (VideoView) findViewById(R.id.videoView);
        Uri path = Uri.parse("android.resource://com.univalle.video/"+ R.raw.videoplayback);
        video1.setVideoURI(path);
        MediaController mc = new MediaController(this);
        video1.setMediaController(mc);
        video1.start();
    }
}
