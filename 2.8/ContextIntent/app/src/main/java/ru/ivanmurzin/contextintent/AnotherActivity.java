package ru.ivanmurzin.contextintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import ru.ivanmurzin.contextintent.databinding.AnotherActivityBinding;

public class AnotherActivity extends Activity implements View.OnClickListener {

    AnotherActivityBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = AnotherActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(this);

        Intent intent = getIntent();
        Cat cat = (Cat) intent.getSerializableExtra("someData");
        binding.someText.setText(cat.toString());
        cat.meow();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                finish();
        }
    }
}
