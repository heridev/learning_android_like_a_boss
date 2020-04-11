package com.example.tutorialspointcourse;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

public class ActivityServiceExample extends AppCompatActivity {
    String msg = "Initializing the ActivityServiceExample";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_example);
        Log.d(msg, "The onCreate() event");
    }


    public void startService(View view) {
        String onStart = "on start click";
        Log.d(onStart, "The onCreate() event");
        startService(new Intent(getBaseContext(), MyService.class));
    }

    // Method to stop the service
    public void stopService(View view) {
        String onStop = "on start click";
        Log.d(onStop, "The onCreate() event");
        stopService(new Intent(getBaseContext(), MyService.class));
    }

}
