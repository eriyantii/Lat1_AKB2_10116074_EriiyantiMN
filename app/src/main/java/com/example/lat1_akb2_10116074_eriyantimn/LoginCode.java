package com.example.lat1_akb2_10116074_eriyantimn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginCode extends AppCompatActivity {
    Button blogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);
        blogin=findViewById(R.id.b_masuk);
        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten=new Intent( LoginCode.this,Biodata.class);
                startActivity(inten);
            }
        });
    }
}
