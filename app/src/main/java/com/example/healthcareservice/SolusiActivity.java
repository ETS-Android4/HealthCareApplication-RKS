package com.example.healthcareservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SolusiActivity extends AppCompatActivity {
    public Button Konsultasi, Pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solusi);

        Konsultasi = (Button) findViewById(R.id.konsultasii);
        Pesan = (Button) findViewById(R.id.pesan);
        Konsultasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent konsultasi = new Intent(SolusiActivity.this, KonsultasiActivity.class);
                startActivity(konsultasi);
            }
        });

        Pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pesan = new Intent(SolusiActivity.this, ObrolanActivity.class);
                startActivity(pesan);
            }
        });
    }
}