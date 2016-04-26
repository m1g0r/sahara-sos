package com.example.m1g0r.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.TabHost;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class ContactusActivity extends AppCompatActivity {

    SupportMapFragment mapFragment;
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tab One");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Київ");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Tab Two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Тернопіль");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Tab Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Івано-Франківськ");
        host.addTab(spec);

//        google maps
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.kievmap);
        map = mapFragment.getMap();
        if (map == null) {
            finish();
            return;
        }

        initkiev();

        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.termap);
        map = mapFragment.getMap();
        if (map == null) {
            finish();
            return;
        }

        initter();

        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.ifmap);
        map = mapFragment.getMap();
        if (map == null) {
            finish();
            return;
        }

        initif();

    }

    public void initkiev() {
        LatLng latLng = new LatLng(50.478867, 30.492193);
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 12));
        map.getUiSettings().setScrollGesturesEnabled(false);
        map.getUiSettings().setZoomControlsEnabled(true);
        map.addMarker(new MarkerOptions()
                .position(new LatLng(50.478867, 30.492193))
                .title("САХАРА")
                .draggable(false));
    }

    public void initter() {
        LatLng latLng = new LatLng(49.552370, 25.611009);
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 13));
        map.getUiSettings().setScrollGesturesEnabled(false);
        map.getUiSettings().setZoomControlsEnabled(true);
        map.addMarker(new MarkerOptions()
                .position(new LatLng(49.552370, 25.611009))
                .title("САХАРА")
                .draggable(false));
    }

    public void initif() {
        LatLng latLng = new LatLng(48.925674, 24.716019);
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 13));
        map.getUiSettings().setScrollGesturesEnabled(false);
        map.getUiSettings().setZoomControlsEnabled(true);
        map.addMarker(new MarkerOptions()
                .position(new LatLng(48.925674, 24.716019))
                .title("САХАРА")
                .draggable(false));
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

}
