package com.example.oliverchang.codedayproject;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Send extends AppCompatActivity {

    EditText txtPhoneNo;
    EditText txtMessage;
    ImageButton button;

    private String s;

    Global2 w = Global2.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        txtPhoneNo = (EditText)this.findViewById(R.id.txtPhoneNo);
        //txtMessage = (EditText)this.findViewById(R.id.txtMessage);
        button = (ImageButton) this.findViewById(R.id.imageButton24);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNo = txtPhoneNo.getText().toString();
                String message = getIntent().getStringExtra("message");
                if (message != null) {
                    sendMessage(phoneNo, message);
                    Log.e("SEND", message);
                } else {
                    Log.e("SEND", "MESSAGE IS NULL");
                }

            }
        });

    }
    private void sendMessage(String phoneNo, String message){
        SmsManager sms = SmsManager.getDefault();

        sms.sendTextMessage(phoneNo, null, message, null, null);
        Log.e("SEND", "MESSAGE ALLEGEDLY SENT");
        Log.e("SEND", "MESSAGE ALLEGEDLY SENT");
    }
}
