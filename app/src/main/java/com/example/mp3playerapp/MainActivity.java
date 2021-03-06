package com.example.mp3playerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        mediaPlayer = MediaPlayer.create(this, R.raw.believer);
        button1.setOnClickListener(v -> mediaPlayer.start());

        button2.setOnClickListener(v -> mediaPlayer.pause());

        button3.setOnClickListener(v -> mediaPlayer.stop());
    }
}