package ru.ivanmurzin.fragmentsandsensors;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import ru.ivanmurzin.fragmentsandsensors.databinding.ActivityMainBinding;
import ru.ivanmurzin.fragmentsandsensors.fragments.FirstFragment;
import ru.ivanmurzin.fragmentsandsensors.fragments.ThirdFragment;
import ru.ivanmurzin.fragmentsandsensors.fragments.ui.login.LoginFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private final FragmentManager fragmentManager = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        swapFragment(new FirstFragment());

        binding.button1.setOnClickListener(view -> swapFragment(new FirstFragment()));
        binding.button2.setOnClickListener(view -> swapFragment(new LoginFragment()));
        binding.button3.setOnClickListener(view -> swapFragment(new ThirdFragment()));
    }

    private void swapFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.placeholder, fragment);
        fragmentTransaction.commit();
    }
}