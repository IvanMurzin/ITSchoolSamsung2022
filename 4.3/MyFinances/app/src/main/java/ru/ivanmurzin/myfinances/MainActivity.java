package ru.ivanmurzin.myfinances;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import ru.ivanmurzin.myfinances.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private final List<Finances> list = new ArrayList<>();
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initData();
        setupUI();
    }

    private void setupUI() {
//        binding.recyclerView.setLayoutManager(new LinearLayoutManager(
//                        this,
//                        LinearLayoutManager.VERTICAL,
//                        false
//                )
//        );
//        binding.recyclerView.setAdapter(new MyFinancesAdapter(list));
//        binding.addButton.setOnClickListener(view -> {
//            list.add(Finances.getRandom());
//            binding.recyclerView.getAdapter().notifyItemChanged(list.size() - 1);
//        });


        binding.addButton.set



    }

    private void initData() {
        for (int i = 0; i < 3; i++) {
            list.add(Finances.getRandom());
        }
    }
}