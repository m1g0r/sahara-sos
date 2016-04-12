package com.example.m1g0r.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    Button sendBtn;
    EditText txtMessage;
    TextView txtphoneNo;
    CheckBox checkbox;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendBtn = (Button) findViewById(R.id.sendSMS);
        txtphoneNo = (TextView) findViewById(R.id.phone);
        txtMessage = (EditText) findViewById(R.id.smsBody);
        checkbox = (CheckBox) findViewById(R.id.checkBox);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendSMSMessage();
            }
        });

    }


    public void sendSMSMessage() {

        Log.i("Send SMS", "");
        String phoneNo = txtphoneNo.getText().toString();
        String message = txtMessage.getText().toString() + (checkbox.isChecked() ?
                (" - " + checkbox.getText().toString()) : "");

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNo, null, message, null, null);
            Toast.makeText(getApplicationContext(), "СМС із запитом відправлено в сервісну службу", Toast.LENGTH_LONG).show();
        }

        catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Помилка відправлення СМС", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }


    public void facebook(View view) {
        Intent facebookIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/sahara.com.ua"));
        startActivity(facebookIntent);
    }

    public void twitter(View view) {
        Intent twitterIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/saharacomua"));
        startActivity(twitterIntent);
    }

    public void instagram(View view) {
        Intent instagramIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/sahara_smart/"));
        startActivity(instagramIntent);
    }

    public void youtube(View view) {
        Intent youtubeIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/channel/UCbm-QK0tyM4szL8T05HHYvg/videos"));
        startActivity(youtubeIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(),
                        "Вибачте. Меню НАЛАШТУВАННЯ ще не активне", Toast.LENGTH_LONG).show();
                return true;

            case R.id.action_aboutus:
                Toast.makeText(getApplicationContext(),
                        "Вибачте. Розділ ПРО КОМПАНІЮ ще не активний", Toast.LENGTH_LONG).show();
                return true;

            case R.id.action_contacts:
                Toast.makeText(getApplicationContext(),
                        "Відображення контактної інформації", Toast.LENGTH_LONG).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
