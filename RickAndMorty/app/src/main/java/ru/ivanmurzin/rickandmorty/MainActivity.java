package ru.ivanmurzin.rickandmorty;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import ru.ivanmurzin.rickandmorty.controller.AuthController;
import ru.ivanmurzin.rickandmorty.model.response.Character;
import ru.ivanmurzin.rickandmorty.provider.ApiController;
import ru.ivanmurzin.rickandmorty.view.Adapter;

public class MainActivity extends AppCompatActivity {

    private ApiController controller = new ApiController();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AuthController authController = new AuthController();
        if (!authController.isAuth()) {
            startActivity(new Intent(this, RegisterActivity.class));
            finish();
        }
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        new Thread(() -> {
            List<Character> data = controller.getAllCharacters();
            runOnUiThread(() -> {
                recyclerView.setAdapter(new Adapter(data));
            });
        }).start();

        FloatingActionButton fab = findViewById(R.id.next);
        fab.setOnClickListener(view -> {
            controller.incPage();
            new Thread(() -> {
                List<Character> data = controller.getAllCharacters();
                runOnUiThread(() -> {
                    recyclerView.setAdapter(new Adapter(data));
                });
            }).start();
        });
    }
}