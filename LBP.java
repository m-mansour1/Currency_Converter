package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LBP extends AppCompatActivity {

    Button lbpbutton;
    EditText lbpEditText;
    TextView lbpresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lbp);

        lbpbutton = findViewById(R.id.convertlbp);
        lbpEditText = findViewById(R.id.lbpedit);
        lbpresult = findViewById(R.id.lbpres);

        lbpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double lbpvalue = Double.parseDouble(lbpEditText.getText().toString());
                Double valueusd =  lbpvalue / 15000;
                lbpresult.setText("  " + valueusd +"$");
            }
        });
    }
}
