package ru.myitschool.mte;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import ru.myitschool.mte.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.content.ibCar.setOnClickListener(new CarClickListener());
    }

    class CarClickListener implements View.OnClickListener {
        private final int car1 = R.drawable.car1;
        private final int car2 = R.drawable.car2;
        private final int car3 = R.drawable.car3;
        private int carNumber = 0;

        @Override
        public void onClick(View view) {
            switch (carNumber) {
                case 0:
                    binding.content.ibCar.setImageResource(car2);
                    break;
                case 1:
                    binding.content.ibCar.setImageResource(car3);
                    break;
                case 2:
                    binding.content.ibCar.setImageResource(car1);
                    break;
            }
            carNumber = (carNumber + 1) % 3;
        }
    }
}
