package com.example.oliverchang.codedayproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.gsm.SmsManager;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ViewGroup RelativeLayout;
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setupMessageButton();
        setupMessageButton2();

        music = MediaPlayer.create(this, R.raw.music);
        music.start();

        setupMessageButton3();
    }

   /*
*/
    private void setupMessageButton(){
        ImageButton messageButton = (ImageButton) findViewById(R.id.imageButton);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "You Clicked it", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }

    private void setupMessageButton2(){
        ImageButton messageButton = (ImageButton) findViewById(R.id.imageButton12);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "You Clicked it", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, MyQuotes.class));
            }
        });
    }

    private void setupMessageButton3(){
        ImageButton messageButton = (ImageButton) findViewById(R.id.imageButton25);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "You Clicked it", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, Videos.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
