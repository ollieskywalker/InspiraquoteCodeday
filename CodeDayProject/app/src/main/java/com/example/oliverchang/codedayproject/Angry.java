package com.example.oliverchang.codedayproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Angry extends AppCompatActivity {
    private int x;

    Global y = Global.getInstance();

    private String s;

    Global2 w = Global2.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angry);

        final TextView textOne = (TextView) findViewById(R.id.textView);
        final String[] quotes = {"Holding on to anger is like grasping a hot coal with the intent of throwing it at someone else; you are \n" +
                "\n" +
                "the one who gets burned.\n" +
                "\n" +
                "\u00ADBUDDHA","When anger rises, think of the consequences.\n" +
                "\n" +
                "\u00ADCONFUCIUS","Every day we have plenty of opportunities to get angry, stressed or offended. But what you're doing \n" +
                "\n" +
                "when you indulge these negative emotions is giving something outside yourself power over your \n" +
                "\n" +
                "happiness. You can choose to not let little things upset you.\n" +
                "\n" +
                "\u00ADJOEL OSTEEN","“If you spend your time hoping someone will suffer the consequences for what they did to your heart, \n" +
                "\n" +
                "then you're allowing them to hurt you a second time in your mind.” SHANNON L. ALDER","“Anger, resentment and jealousy doesn't change the heart of others\u00AD\u00AD it only changes yours.”  \u00AD Shannon L. Alder" ,
                "I am a danger to myself if I get angry.\n" +
                "\n" +
                "ORIANA FALLACI",
                "Life is 10% what happens to you and 90% how you react to it.\n" +
                        "\n" +
                        "CHARLES R. swindoll",
                "If a small thing has the power to make you angry, does that \n" +
                        "\n" +
                        "not indicate something about your size?\n" +
                        "\n" +
                        "SYDNEY J. HARRIS"};
        ImageButton pushMe = (ImageButton) findViewById(R.id.imageButton7);

        pushMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int rando = (int)(Math.random()*7);
                textOne.setText(quotes[rando]);
                //startActivity(new Intent(Angry.this, Main2Activity.class));\
                x = rando;
            }

        });

        ImageButton save = (ImageButton) findViewById(R.id.imageButton18);
        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Angry.this, Main2Activity.class));
                //  list.add(quotes5[x]);
                Toast.makeText(Angry.this, "Added to Favorites", Toast.LENGTH_LONG).show();
                y.add(quotes[x]);
            }

        });

        ImageButton send = (ImageButton) findViewById(R.id.imageButton20);
        send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                w.getGlobal2(quotes[x]);
                Intent i = new Intent(Angry.this, Send.class);
                i.putExtra("message" , w.getMessage());
                startActivity(i);
                //  list.add(quotes5[x]);
                //Toast.makeText(Happy.this, "Added to Favorites", Toast.LENGTH_LONG).show();
                //y.add(quotes2[x]);
            }
        });
    }

   // final String[] quotes = {"","","","",""};
}
