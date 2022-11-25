package ru.ivanmurzin.contextintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import ru.ivanmurzin.contextintent.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.text.setText("MainActivity" + new Random().nextInt(10));
        binding.button.setOnClickListener(this);
        binding.bg.setBackgroundColor(getRandomColor());
        // setContentView(R.layout.another_activity)
    }

    private int getRandomColor() {
        int color;
        switch (new Random().nextInt(7)) {
            case 1:
                color = getColor(R.color.black);
                break;
            case 2:
                color = getColor(R.color.teal_200);
                break;
            case 3:
                color = getColor(R.color.teal_700);
                break;
            case 4:
                color = getColor(R.color.white);
                break;
            case 5:
                color = getColor(R.color.purple_200);
                break;
            case 6:
                color = getColor(R.color.purple_500);
                break;
            default:
                color = getColor(R.color.purple_700);
        }
        return color;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
                Cat cat = new Cat("Barsik");
                intent.putExtra("someData", cat);
                startActivity(intent);
                break;
        }
    }
}