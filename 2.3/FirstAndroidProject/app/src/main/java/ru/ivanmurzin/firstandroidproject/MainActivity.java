package ru.ivanmurzin.firstandroidproject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    private void log(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Log.d("AWESOME_TAG", message);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log("I am created"); 
    }

    @Override
    protected void onStart() {
        super.onStart();
        log("I am started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        log("I am resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        log("I am paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        log("I am stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log("I am destroyed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        log("I am restarted");
    }
}