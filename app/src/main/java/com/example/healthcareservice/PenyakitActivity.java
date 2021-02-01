package com.example.healthcareservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PenyakitActivity extends AppCompatActivity {
    public Button sakiperut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit);
        sakiperut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sakitperut = new Intent(PenyakitActivity.this, SolusiActivity.class);
                startActivity(sakitperut);
            }
        });
    }
}