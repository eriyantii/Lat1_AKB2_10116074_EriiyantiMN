package com.example.lat1_akb2_10116074_eriyantimn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Biodata extends AppCompatActivity {
    Button bio;
    TextView ET1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        bio=findViewById(R.id.button4);
        ET1=findViewById(R.id.editText);
        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten=new Intent( Biodata.this,SayHay.class);
                inten.putExtra("nama",ET1.getText().toString());
                startActivity(inten);
            }
        });
    }
}
