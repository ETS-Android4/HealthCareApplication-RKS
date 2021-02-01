package com.example.healthcareservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WellcomeActivity extends AppCompatActivity {
    public Button btnLogin, btnRegistrasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);

        btnLogin = (Button) findViewById(R.id.btnlogin);
        btnRegistrasi = (Button) findViewById(R.id.btnregistrasi);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(WellcomeActivity.this, LoginActivity.class);
                startActivity(login);
            }
        });
        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrasi = new Intent(WellcomeActivity.this, RegistrasiActivity.class);
                startActivity(registrasi);
            }
        });
    }
}