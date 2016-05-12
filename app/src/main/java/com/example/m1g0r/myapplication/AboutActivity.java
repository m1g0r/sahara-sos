package com.example.m1g0r.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                Toast.makeText(getApplicationContext(),
                        "Вибачте. Меню НАЛАШТУВАННЯ ще не активне", Toast.LENGTH_LONG).show();
                return true;

            case R.id.action_aboutus:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                Intent aboutus = new Intent(AboutActivity.this, AboutActivity.class);
                startActivity(aboutus);
                return true;

            case R.id.action_contacts:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                Intent contacts = new Intent(AboutActivity.this, ContactusActivity.class);
                startActivity(contacts);
                return true;

            case R.id.action_about_program:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                Intent aboutprogram = new Intent(AboutActivity.this, AboutProgramActivity.class);
                startActivity(aboutprogram);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}