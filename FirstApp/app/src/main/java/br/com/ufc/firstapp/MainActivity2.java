package br.com.ufc.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    MediaPlayer Morena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Morena = MediaPlayer.create(this,R.raw.Morena);
    }

    public void PlayMusica(View view) {
        Morena.start();
    }
}