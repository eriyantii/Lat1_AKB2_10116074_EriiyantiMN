package com.example.lat1_akb2_10116074_eriyantimn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SayHay extends AppCompatActivity {
    Button btn5;
    TextView Tv8;
    String nm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hay);
        btn5 =findViewById(R.id.button5);
        Tv8  =findViewById(R.id.textViewView);

        nm =getIntent().getStringExtra("nama");
        Tv8.setText("Beres! Sekarang "+nm+"\n udah bisa ngecek \n penggunaan HP \n mu \n tiap hari buat bantu kamu \n ngatur waktu :)");
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
