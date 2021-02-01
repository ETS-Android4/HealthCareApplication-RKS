package com.example.healthcareservice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CheckinActivity extends AppCompatActivity {
    public Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);

        order = (Button) findViewById(R.id.pesan);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent order = new Intent(Intent.ACTION_DIAL, Uri.parse("https://www.google.com/maps/dir/Universitas+Ahmad+Dahlan+-+Kampus+4,+Jalan+Ringroad+Selatan,+Kragilan,+Tamanan,+Bantul,+Daerah+Istimewa+Yogyakarta/Rumah+Sehat+dan+Apotek+UGM,+Jl.+DR.+Sardjito+No.25,+Terban,+Kec.+Gondokusuman,+Kota+Yogyakarta,+Daerah+Istimewa+Yogyakarta+55223/@-7.8064982,110.3563981,13z/data=!4m13!4m12!1m5!1m1!1s0x2e7a5701a2ae1c23:0x173dbeeddc56d9e!2m2!1d110.3831212!2d-7.8332349!1m5!1m1!1s0x2e7a59ee9c36d4a5:0xd72969cfee31ec62!2m2!1d110.3724039!2d-7.775701?hl=id"));
                startActivity(order);
            }
        });

    }
}