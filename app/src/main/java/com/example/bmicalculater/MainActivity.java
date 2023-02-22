package com.example.bmicalculater;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText wgt,hgt;
    Button btn;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wgt = findViewById(R.id.wgt);
        hgt = findViewById(R.id.hgt);
        btn = findViewById(R.id.btn);
        Result = findViewById(R.id.Result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Float h = Float.parseFloat(hgt.getText().toString());
                Float w = Float.parseFloat(wgt.getText().toString());

                Result.setText("Ans= "+w/((h/100)*(h/100)));
            }
        });


    }
}