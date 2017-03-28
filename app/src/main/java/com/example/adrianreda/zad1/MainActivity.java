package com.example.adrianreda.zad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but1=(Button)findViewById(R.id.button1);
        Button but2=(Button)findViewById(R.id.button2);
        Button but3=(Button)findViewById(R.id.button3);



        but1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk1");
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk2");
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk3");
            }
        });




        Button but4=(Button)findViewById(R.id.button4);

        but4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText ed1 = (EditText) findViewById(R.id.editText1);
                EditText ed2 = (EditText) findViewById(R.id.editText2);
                TextView textView = (TextView) findViewById(R.id.textView1);
                textView.setText(ed1.getText());
                TextView textView2 = (TextView) findViewById(R.id.textView2);
                textView2.setText(ed2.getText());
            }
        });

    }
}
