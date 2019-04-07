package com.example.lat1_akb2_10116074_eriyantimn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    /*
    Eriyanti Mulya Ningsih
    10116074
    IF-2
    Change Log Sabtu 6 April
    1. membuat mainActivity     jam 09.45
    2. membuat LoginCode        jam 10.20
    3. membuat Biodata          jam 10.55
    4. membuat Sayhhay/finish   jam 11.25

     */

public class MainActivity extends AppCompatActivity {

    Button btn_mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_mulai=findViewById(R.id.btnmulai);
        btn_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten=new Intent ( MainActivity.this,LoginCode.class);
                startActivity(inten);
            }
        });
    }
}
