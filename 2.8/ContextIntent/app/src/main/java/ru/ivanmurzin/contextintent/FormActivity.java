package ru.ivanmurzin.contextintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import ru.ivanmurzin.contextintent.databinding.ActivityFormBinding;

public class FormActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityFormBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFormBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.ok.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String name = binding.name.getText().toString();
        String surname = binding.surname.getText().toString();
        Toast.makeText(this, name + " " + surname, Toast.LENGTH_SHORT).show();
        Log.d("MY AWESOME APP", name + " " + surname);
        Intent intent = new Intent();
        Uri uri = Uri.parse("https://google.com");
        intent.setData(uri);
        intent.putExtra("superName", name);
        intent.putExtra("superSurname", surname);
        setResult(RESULT_OK, intent);
        finish();
    }
}