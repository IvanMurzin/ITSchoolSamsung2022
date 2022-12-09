package ru.ivanmurzin.listapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<Month> adapter;

    private final Month[] months = new Month[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        months[0] = new Month("Январь", -20);
        months[1] = new Month("Февраль", -25);
        months[2] = new Month("Март", -5);
        months[3] = new Month("Апрель", 0);
        months[4] = new Month("Май", 20);
        months[5] = new Month("Июнь", 25);
        months[6] = new Month("Июль", 30);
        months[7] = new Month("Август", 40);
        months[8] = new Month("Сентябрь", 10);
        months[9] = new Month("Октябрь", 0);
        months[10] = new Month("Ноябрь", -5);
        months[11] = new Month("Декабрь", -45);

        listView = findViewById(R.id.list_view);
        adapter = new MyMonthAdapter(this, months);
        listView.setAdapter(adapter);
    }


    class MyMonthAdapter extends ArrayAdapter<Month> {

        final Month[] months;

        public MyMonthAdapter(@NonNull Context context, Month[] months) {
            super(context, R.layout.list_item);
            this.months = months;
        }

        @Override
        public int getCount() {
            return months.length;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            Month month = months[position];
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, null);
            }
            TextView monthName = convertView.findViewById(R.id.month_name);
            monthName.setText(month.name);

            TextView monthTemperature = convertView.findViewById(R.id.month_temperature);
            monthTemperature.setText(String.valueOf(month.temperature));

            ImageView imageView = convertView.findViewById(R.id.month_icon);
            if (month.temperature > 0) imageView.setImageResource(R.drawable.sun);
            else imageView.setImageResource(R.drawable.snowflake);

            return convertView;
        }
    }
}