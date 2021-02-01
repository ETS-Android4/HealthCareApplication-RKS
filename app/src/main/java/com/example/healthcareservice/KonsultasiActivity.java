package com.example.healthcareservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class KonsultasiActivity extends AppCompatActivity {
    public Button dokter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsultasi);

        dokter = (Button) findViewById(R.id.dokter);
        dokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dokter = new Intent(KonsultasiActivity.this, ViewDokterActivity.class);
                startActivity(dokter);
            }
        });

    }
}