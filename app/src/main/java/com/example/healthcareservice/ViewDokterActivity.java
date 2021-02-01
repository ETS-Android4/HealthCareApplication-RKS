package com.example.healthcareservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ViewDokterActivity extends AppCompatActivity {
    public Button konsultasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_dokter);

        konsultasi = (Button) findViewById(R.id.konsultasi);
        konsultasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent konsultasi = new Intent(ViewDokterActivity.this, ObrolanActivity.class);
                startActivity(konsultasi);
            }
        });

    }
}