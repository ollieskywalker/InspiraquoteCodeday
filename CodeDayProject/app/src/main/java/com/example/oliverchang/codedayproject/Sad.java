package com.example.oliverchang.codedayproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Sad extends AppCompatActivity {

    private int x;

    Global y = Global.getInstance();

    private String s;

    Global2 w = Global2.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad);

        final TextView textOne = (TextView) findViewById(R.id.textView4);
        final String[] quotes4 = {"“Although the world is full of suffering, it is also full of the overcoming of it.”\n" +
                "\n" +
                "~HELEN KELLER","“Self-pity gets you nowhere. One must have the adventurous daring to accept\n" +
                "\n" +
                "oneself as a bundle of possibilities and undertake the most interesting game in \n" +
                "\n" +
                "the world: making the most of one’s best.” ~HARRY EMERSON FOSDICK","Try to be a rainbow in someone's cloud.\n" +
                "\n" +
                "MAYA ANGELOU","Nothing is impossible, the word itself says 'I'm possible'!\n" +
                "\n" +
                "AUDREY HEPBURN","If opportunity doesn't knock, build a door.\n" +
                "\n" +
                "MILTON BERNE",
        "You must do the things you think you cannot do.\n" +
                "\n" +
                "Eleanor Roosevelt",
         "A hero is someone who has given his or her life to something \n" +
                 "\n" +
                 "bigger than oneself.\n" +
                 "\n" +
                 "Joseph Campbell",
        "If we did all the things we are capable of, we would literally \n" +
                "\n" +
                "astound ourselves.\n" +
                "\n" +
                "Thomas A. Edison"};

        ImageButton pushMe = (ImageButton) findViewById(R.id.imageButton10);
        pushMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int rando = (int)(Math.random()*7);
                textOne.setText(quotes4[rando]);
                //startActivity(new Intent(Angry.this, Main2Activity.class));
                x = rando;
            }

        });

        ImageButton save = (ImageButton) findViewById(R.id.imageButton15);
        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Angry.this, Main2Activity.class));
                //  list.add(quotes5[x]);
                Toast.makeText(Sad.this, "Added to Favorites", Toast.LENGTH_LONG).show();
                y.add(quotes4[x]);
            }

        });

        ImageButton send = (ImageButton) findViewById(R.id.imageButton22);
        send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                w.getGlobal2(quotes4[x]);
                Intent i = new Intent(Sad.this, Send.class);
                i.putExtra("message" , w.getMessage());
                startActivity(i);
                //  list.add(quotes5[x]);
                //Toast.makeText(Happy.this, "Added to Favorites", Toast.LENGTH_LONG).show();
                //y.add(quotes2[x]);
            }
        });
    }
}
