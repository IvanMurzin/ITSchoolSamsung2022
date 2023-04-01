package ru.ivanmurzin.newsapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ru.ivanmurzin.newsapplication.adapter.MyNewsAdapter;
import ru.ivanmurzin.newsapplication.databinding.ActivityMainBinding;
import ru.ivanmurzin.newsapplication.model.News;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private final News[] data = new News[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initData();
        setupUI();
    }

    private void setupUI() {
        binding.listView.setAdapter(new MyNewsAdapter(this, data));
    }

    private void initData() {
        data[0] = new News("I am news 1", 4, 11, 19, R.drawable.news1);
        data[1] = new News("I am news 2", 44, 31, 12, R.drawable.news2);
        data[2] = new News("I am news 3", 2, 1, 100, R.drawable.news3);
        data[3] = new News("I am news 4", 14, 10, 1, R.drawable.news4);
    }
}