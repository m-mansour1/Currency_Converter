package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class USD extends AppCompatActivity {


    Button usdbutton;
    EditText usdEditText;
    TextView usdresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usd);

        usdbutton = findViewById(R.id.convertusd);
        usdEditText = findViewById(R.id.usdedit);
        usdresult = findViewById(R.id.usdres);

        usdbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double usdvalue = Double.parseDouble(usdEditText.getText().toString());
                Double valuelbp =  usdvalue * 15000;
                usdresult.setText("  " + valuelbp+" ل.ل.\u200E");
            }
        });
    }
}