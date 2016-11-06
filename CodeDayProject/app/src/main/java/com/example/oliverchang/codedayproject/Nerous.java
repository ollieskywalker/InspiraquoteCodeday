package com.example.oliverchang.codedayproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Nerous extends AppCompatActivity {

    private int x;

    Global y = Global.getInstance();

    private String s;

    Global2 w = Global2.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nerous);

        final TextView textOne = (TextView) findViewById(R.id.textView3);
        final String[] quotes3 = {"A well adjusted person is one who makes the same mistake twice without getting nervous.\n" +
                "\n" +
                "ALEXANDER HAMILTON",
                "Don't try to be what you're not. If you're nervous, be nervous. If you're shy, be shy.\n" +
                "\n" +
                "ADRIANA LIMA",
                "Meditation makes the entire nervous system go into a field of \n" +
                "\n" +
                "coherence.\n" +
                "\n" +
                "DEEPAK CHOMA","You should never get nervous about anything. What today \n" +
                "\n" +
                "seems important tomorrow isn't so any more.\n" +
                "\n" +
                "TITO VILLANOVA","Being nervous is not something you should be ashamed of. \n" +
                "\n" +
                "Nervous means you care, you really want to do well.\n" +
                "\n" +
                "PAULA CREAMER"};

        ImageButton pushMe = (ImageButton) findViewById(R.id.imageButton9);
        pushMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int rando = (int)(Math.random()*5);
                textOne.setText(quotes3[rando]);
                //startActivity(new Intent(Angry.this, Main2Activity.class));
                x = rando;
            }

        });

        ImageButton save = (ImageButton) findViewById(R.id.imageButton16);
        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Angry.this, Main2Activity.class));
                //  list.add(quotes5[x]);
                Toast.makeText(Nerous.this, "Added to Favorites", Toast.LENGTH_LONG).show();
                y.add(quotes3[x]);
            }

        });

        ImageButton send = (ImageButton) findViewById(R.id.imageButton21);
        send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                w.getGlobal2(quotes3[x]);
                Intent i = new Intent(Nerous.this, Send.class);
                i.putExtra("message" , w.getMessage());
                startActivity(i);
                //  list.add(quotes5[x]);
                //Toast.makeText(Happy.this, "Added to Favorites", Toast.LENGTH_LONG).show();
                //y.add(quotes2[x]);
            }
        });
    }
}
