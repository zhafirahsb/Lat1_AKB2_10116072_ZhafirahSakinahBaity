package com.example.lat1_akb2_10116072_zhafirahsakinahbaity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class isidata extends AppCompatActivity {
    TextView nama;
    Button B_selanjutnya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isidata);

        nama = findViewById(R.id.Nama);
        B_selanjutnya=findViewById(R.id.btn_selanjutnya);
        B_selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intn = new Intent(isidata.this,hasil.class);
                intn.putExtra("nama", nama.getText().toString());
                startActivity(intn);
            }
        });

    }
}
