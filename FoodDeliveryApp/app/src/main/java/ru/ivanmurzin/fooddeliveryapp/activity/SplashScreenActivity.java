package ru.ivanmurzin.fooddeliveryapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // super heavy logic
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, EnterActivity.class));
        finish();
    }
}