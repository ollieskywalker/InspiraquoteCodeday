package com.example.oliverchang.codedayproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MyQuotes extends AppCompatActivity {

    Global y = Global.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_quotes);

        final TextView textOne = (TextView) findViewById(R.id.textView6);

        ImageButton pushMe = (ImageButton) findViewById(R.id.imageButton14);
        pushMe.setOnClickListener(new View.OnClickListener() {
            ArrayList<String> list = new ArrayList<String>();

            @Override
            public void onClick(View v) {
                int rando = (int) (Math.random() * list.size());
                textOne.setText(y.get());
                //startActivity(new Intent(Angry.this, Main2Activity.class));
            }

        });

    }
}
