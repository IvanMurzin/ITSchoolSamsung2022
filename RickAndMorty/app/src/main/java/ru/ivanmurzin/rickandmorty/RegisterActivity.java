package ru.ivanmurzin.rickandmorty;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import ru.ivanmurzin.rickandmorty.controller.AuthController;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button button = findViewById(R.id.register);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        AuthController controller = new AuthController();
        button.setOnClickListener(view -> {
            String emailString = email.getText().toString();
            String passwordString = password.getText().toString();
            controller.registerUser(emailString, passwordString, task -> {
                if (task.isSuccessful()) {
                    Toast.makeText(this, task.getResult().getUser().getEmail(), Toast.LENGTH_SHORT).show();
                    // to main Activity
                } else {
                    Toast.makeText(this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        });
    }
}