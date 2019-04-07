package com.example.lat1_akb2_10116072_zhafirahsakinahbaity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class hasil extends AppCompatActivity {
    TextView hasil;
    String nama;
    Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        hasil= findViewById(R.id.hasil);
        ok = findViewById(R.id.btn_oke);
        nama = getIntent().getStringExtra("nama");

        hasil.setText("Beres! Sekarang " + nama
                + " udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
