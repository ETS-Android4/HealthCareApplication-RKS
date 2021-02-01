package com.example.healthcareservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrasiActivity extends AppCompatActivity {
    private Button buatAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        buatAkun = (Button) findViewById(R.id.btnRegistrasi);
        buatAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(RegistrasiActivity.this, LoginActivity.class);
                startActivity(register);
            }
        });
    }
}