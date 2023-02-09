package ru.ivanmurzin.fooddeliveryapp.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import ru.ivanmurzin.fooddeliveryapp.fragment.LoginFragment;
import ru.ivanmurzin.fooddeliveryapp.fragment.RegistrationFragment;

public class EnterPagerAdapter extends FragmentPagerAdapter {
    final Fragment[] fragments = new Fragment[2];

    public EnterPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragments[0] = new LoginFragment();
        fragments[1] = new RegistrationFragment();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return position == 0 ? "Авторизация" : "Регистрация";
    }
}
