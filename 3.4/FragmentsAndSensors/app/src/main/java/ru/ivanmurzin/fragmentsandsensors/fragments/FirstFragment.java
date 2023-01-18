package ru.ivanmurzin.fragmentsandsensors.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import ru.ivanmurzin.fragmentsandsensors.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        binding.buttonTest.setOnClickListener(_view -> {
            Toast.makeText(getContext(), "Test", Toast.LENGTH_SHORT).show();
        });
        return binding.getRoot();
    }
}
