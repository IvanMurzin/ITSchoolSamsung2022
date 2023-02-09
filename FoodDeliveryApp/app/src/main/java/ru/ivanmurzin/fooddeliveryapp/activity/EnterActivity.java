package ru.ivanmurzin.fooddeliveryapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import ru.ivanmurzin.fooddeliveryapp.R;
import ru.ivanmurzin.fooddeliveryapp.adapter.EnterPagerAdapter;
import ru.ivanmurzin.fooddeliveryapp.databinding.ActivityEnterBinding;

public class EnterActivity extends AppCompatActivity {

    ActivityEnterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        new Thread(() -> {
            try {
                Thread.sleep(1500);
                runOnUiThread(() -> {
                    binding.mainIcon.setVisibility(View.VISIBLE);
                });
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        binding.pager.setAdapter(new EnterPagerAdapter(getSupportFragmentManager()));
        binding.tabs.setupWithViewPager(binding.pager);
    }
}