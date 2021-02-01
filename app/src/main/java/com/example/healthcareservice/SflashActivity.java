package com.example.healthcareservice;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class SflashActivity extends AppCompatActivity {
    public ImageView GambarGif;
    private int time_loading = 8000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sflash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent pindah = new Intent(SflashActivity.this, WellcomeActivity.class);
                startActivity(pindah);
                finish();
            }
        }, time_loading);
        GambarGif = (ImageView) findViewById(R.id.imgGif);
        Glide.with(SflashActivity.this)
                .load(R.drawable.slack)
                .asGif()
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(GambarGif);
    }
}