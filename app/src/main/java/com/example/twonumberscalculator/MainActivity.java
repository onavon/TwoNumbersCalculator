package com.example.twonumberscalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText firstnum, secondnum;
    TextView r;
    Button addbtn;
    double a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstnum=(EditText) findViewById(R.id.editTextNumber);
        secondnum=(EditText) findViewById(R.id.editTextNumber2);
        addbtn=(Button) findViewById(R.id.addbutton);
        r=(TextView) findViewById(R.id.result);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Double.parseDouble(firstnum.getText().toString());
                b=Double.parseDouble(secondnum.getText().toString());
                c=a+b;
                r.setText("Sum="+c);
            }
        });



    }
}