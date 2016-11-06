package com.example.oliverchang.codedayproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Unmotivated extends AppCompatActivity {

    private int x;

    Global y = Global.getInstance();

    private String s;

    Global2 w = Global2.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unmotivated);

        final TextView textOne = (TextView) findViewById(R.id.textView5);
        final String[] quotes5 = {"Desire is the key to motivation, but it's determination and commitment to an unrelenting pursuit of your goal \u00AD a \n" +
                "\n" +
                "commitment to excellence \u00AD that will enable you to attain the success you seek.\n" +
                "\n" +
                "MARIO ANDRETTI","Motivation is what gets you started. Habit is what keeps you \n" +
                "\n" +
                "going.\n" +
                "\n" +
                "JIM RYUN","Accept the challenges so that you can feel the exhilaration of victory.\n" +
                "\n" +
                "GEORGE S. PATTON","What you do today can improve all your tomorrows.\n" +
                "\n" +
                "RALPH MARSTON","The secret of getting ahead is getting started.\n" +
                "\n" +
                "MARK TWAIN",
                "Our greatest weakness lies in giving up. The most\n" +
                    "\n" +
                    "certain way to succeed is always to try just one more \n" +
                    "\n" +
                    "time.\n" +
                    "\n" +
                    "THOMAS A. EDISON",
            "It does not matter how slowly you go as long as you \n" +
                    "\n" +
                    "do not stop.\n" +
                    "\n" +
                    "Confucius",
                    "You have to learn the rules of the game. And then you \n" +
                            "\n" +
                            "have to play better than anyone else.\n" +
                            "\n" +
                            "ALBERT EINSTEIN"};

        ImageButton pushMe = (ImageButton) findViewById(R.id.imageButton11);
        pushMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int rando = (int)(Math.random()*8);
                textOne.setText(quotes5[rando]);
                x = rando;
                //startActivity(new Intent(Angry.this, Main2Activity.class));
            }

        });

        ImageButton save = (ImageButton) findViewById(R.id.imageButton13);
        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Angry.this, Main2Activity.class));
              //  list.add(quotes5[x]);
                Toast.makeText(Unmotivated.this, "Added to Favorites", Toast.LENGTH_LONG).show();
                y.add(quotes5[x]);
            }

        });

        ImageButton send = (ImageButton) findViewById(R.id.imageButton23);
        send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                w.getGlobal2(quotes5[x]);
                Intent i = new Intent(Unmotivated.this, Send.class);
                i.putExtra("message" , w.getMessage());
                startActivity(i);
                //  list.add(quotes5[x]);
                //Toast.makeText(Happy.this, "Added to Favorites", Toast.LENGTH_LONG).show();
                //y.add(quotes2[x]);
            }
        });
    }
}
