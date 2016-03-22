package com.example.m1g0r.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
