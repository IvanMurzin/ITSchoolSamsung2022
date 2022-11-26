package ru.ivanmurzin.contextintent;

import static android.content.ContentValues.TAG;
import static ru.ivanmurzin.contextintent.Constants.FORM_REQUEST_CODE;
import static ru.ivanmurzin.contextintent.Constants.OPEN_DOCUMENT_REQUEST_CODE;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
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
        binding.buttonForResult.setOnClickListener(this);
        binding.buttonForStorage.setOnClickListener(this);
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
        Intent intent;
        switch (view.getId()) {
            case R.id.button:
                intent = new Intent(MainActivity.this, AnotherActivity.class);
                Cat cat = new Cat("Barsik");
                intent.putExtra("someData", cat);
                startActivity(intent);
                break;

            case R.id.button_for_result:
                intent = new Intent(MainActivity.this, FormActivity.class);
                startActivityForResult(intent, FORM_REQUEST_CODE);
                break;
            case R.id.button_for_storage:
                intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
                intent.setType("audio/mpeg"); // MIME
                startActivityForResult(intent, OPEN_DOCUMENT_REQUEST_CODE);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.v(TAG, "request code =" + requestCode + " resultCode=" + resultCode);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case FORM_REQUEST_CODE:
                    Toast.makeText(this, "I get this", Toast.LENGTH_SHORT).show();
                    Log.v(TAG, data.getData().toString());
                    Log.v(TAG, data.getStringExtra("superName"));
                    Log.v(TAG, data.getStringExtra("superSurname"));
//                    Toast.makeText(this, "I get this", Toast.LENGTH_LONG).show();
                case OPEN_DOCUMENT_REQUEST_CODE:
                    if (data != null) {
                        Log.v(TAG, data.getData().toString());
                    } else {
                        Log.wtf(TAG, "data == null");
                    }
                    Log.e(TAG, "onActivityResult: " + data);
            }
        }
    }
}