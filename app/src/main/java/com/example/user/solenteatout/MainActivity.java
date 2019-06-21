package com.example.user.solenteatout;

import android.content.res.Configuration;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

public class MainActivity extends AppCompatActivity {

    MapView mv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Configuration.getIstance().load(this, PreferenceManager.getDefultSharedPreferences(this));
        setContentView(R.layout.activity_main);

        mv = findViewById(R.id.map1);

        mv.setBuiltInZoomControls(true);
        mv.getController().setCenter(new GeoPoint(51.05,-0.72));
    }
}
