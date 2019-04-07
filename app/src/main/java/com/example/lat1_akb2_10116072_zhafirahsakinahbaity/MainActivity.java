 package com.example.lat1_akb2_10116072_zhafirahsakinahbaity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    /*
    Zhafirah Sakinah Baity
    10116117
    IF-2
    Change Log
    Kamis 4 April 2019
    1. Membuat mainActivity Jam 20:50
    2. Membuat Login        Jam 22:02
    Jumat 5 April 2019
    3. Membuat isidata      Jam 20:22
    Sabtu 6 April 2019
    4. Membuat hasil        Jam 05:20
     */

 public class MainActivity extends AppCompatActivity {

    Button B_mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B_mulai=findViewById(R.id.btn_mulai);
        B_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intn=new Intent(MainActivity.this,Login.class);
                startActivity(intn);
            }
        });
    }
}
