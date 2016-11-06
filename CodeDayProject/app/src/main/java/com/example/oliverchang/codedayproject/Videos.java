package com.example.oliverchang.codedayproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Videos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        setupMessageButton();



    }

    private void setupMessageButton(){
        final String[] vids = {"https://www.youtube.com/watch?v=g-jwWYX7Jlo","https://www.youtube.com/watch?v=26U_seo0a1g","https://www.youtube.com/watch?v=0lzxR4JJJfc","https://www.youtube.com/watch?v=LrhSJ1FHeaA","https://www.youtube.com/watch?v=YMz2_S2y9WE"};

        ImageButton messageButton = (ImageButton) findViewById(R.id.imageButton26);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "You Clicked it", Toast.LENGTH_LONG).show();
                int rando = (int)(Math.random()*5);

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(vids[rando])));
            }
        });
    }
}
