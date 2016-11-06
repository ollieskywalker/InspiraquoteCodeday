package com.example.oliverchang.codedayproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Happy extends AppCompatActivity {

    private int x;

    Global y = Global.getInstance();

    private String s;

    Global2 w = Global2.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);

        final TextView textOne = (TextView) findViewById(R.id.textView2);
        final String[] quotes2 = {"“Be content with what you have;\n" +
                "\n" +
                "rejoice in the way things are.\n" +
                "\n" +
                "When you realize there is nothing lacking,\n" +
                "\n" +
                "the whole world belongs to you.” \n" +
                "\n" +
                "― LAO TZU","The best way to pay for a lovely moment is to enjoy it.\n" +
                "\n" +
                "RICHARD BACH","Be happy for this moment. This moment is your life.\n" +
                "\n" +
                "OMAR KHAYYAM","If you want to be happy, be.\n" +
                "\n" +
                "LEO TOLSTOY",
                "Very little is needed to make a happy life; it is all within\n" +
                        "\n" +
                        "yourself, in your way of thinking.\n" +
                        "\n" +
                        "Marcus Aurelius",
                "True happiness is... to enjoy the present, without anxious dependence upon the future.\n" +
                        "\n" +
                        "Lucius Annaeus Seneca",
                "Be happy for this moment. This moment is your life.\n" +
                        "\n" +
                        "Omar Khayyam",
                "Being happy never goes out of style.\n" +
                        "\n" +
                        "Lilly Pulitzer",
                "For every minute you remain angry, you give up sixty \n" +
                        "\n" +
                        "seconds of peace of mind.\n" +
                        "\n" +
                        "Ralph Waldo Emerson"};

        ImageButton pushMe = (ImageButton) findViewById(R.id.imageButton8);
        pushMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int rando = (int)(Math.random()*8);
                textOne.setText(quotes2[rando]);
                //startActivity(new Intent(Angry.this, Main2Activity.clas5r4rrs));
                x = rando;
            }

        });

        ImageButton save = (ImageButton) findViewById(R.id.imageButton17);
        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Angry.this, Main2Activity.class));
                //  list.add(quotes5[x]);
                Toast.makeText(Happy.this, "Added to Favorites", Toast.LENGTH_LONG).show();
                y.add(quotes2[x]);
            }
        });

        ImageButton send = (ImageButton) findViewById(R.id.imageButton19);
        send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                w.getGlobal2(quotes2[x]);
                Intent i = new Intent(Happy.this, Send.class);
                i.putExtra("message" , w.getMessage());
                startActivity(i);
                //  list.add(quotes5[x]);
                //Toast.makeText(Happy.this, "Added to Favorites", Toast.LENGTH_LONG).show();
                //y.add(quotes2[x]);
            }
        });
    }
}
