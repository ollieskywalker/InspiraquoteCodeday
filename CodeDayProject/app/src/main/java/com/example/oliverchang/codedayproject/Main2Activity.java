package com.example.oliverchang.codedayproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        setupMessageButton();
        setupMessageButton2();
        setupMessageButton3();
        setupMessageButton4();
        setupMessageButton5();

    }

    private void setupMessageButton(){
        ImageButton messageButton = (ImageButton) findViewById(R.id.imageButton6);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Main2Activity.this, "You Clicked it", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Main2Activity.this, Angry.class));
            }
        });
    }

    private void setupMessageButton2(){
        ImageButton messageButton = (ImageButton) findViewById(R.id.imageButton2);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Main2Activity.this, "You Clicked it", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Main2Activity.this, Happy.class));
            }
        });
    }

    private void setupMessageButton3(){
        ImageButton messageButton = (ImageButton) findViewById(R.id.imageButton3);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Main2Activity.this, "You Clicked it", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Main2Activity.this, Nerous.class));
            }
        });
    }

    private void setupMessageButton4(){
        ImageButton messageButton = (ImageButton) findViewById(R.id.imageButton4);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Main2Activity.this, "You Clicked it", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Main2Activity.this, Sad.class));
            }
        });
    }

    private void setupMessageButton5(){
        ImageButton messageButton = (ImageButton) findViewById(R.id.imageButton5);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Main2Activity.this, "You Clicked it", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Main2Activity.this, Unmotivated.class));
            }
        });
    }
}
