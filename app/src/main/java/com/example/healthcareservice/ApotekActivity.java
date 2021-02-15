package com.example.healthcareservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ApotekActivity extends AppCompatActivity {
    public Button Apotek;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apotek);

        Apotek = (Button) findViewById(R.id.UGM);
        Apotek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apotek = new Intent(ApotekActivity.this, ViewApotekUGMActivity.class);
                startActivity(apotek);
            }
        });

    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.option, menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch(item.getItemId()){
                case R.id.logout:
                    Intent toLogin = new Intent(ApotekActivity.this, LoginActivity.class);
                    startActivity(toLogin);
                case R.id.about:
                    Intent about = new Intent(ApotekActivity.this, LoginActivity.class);
                    startActivity(about);
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
        }
    }
}