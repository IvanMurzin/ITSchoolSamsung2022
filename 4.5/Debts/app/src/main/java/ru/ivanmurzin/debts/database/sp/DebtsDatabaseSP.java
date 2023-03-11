package ru.ivanmurzin.debts.database.sp;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

import ru.ivanmurzin.debts.database.DebtsDatabase;
import ru.ivanmurzin.debts.database.model.Debt;

public class DebtsDatabaseSP implements DebtsDatabase {
    private SharedPreferences stroage;

    public DebtsDatabaseSP(Context context) {
        stroage = context.getSharedPreferences("storage", Context.MODE_PRIVATE);
    }

    @Override
    public void save(Debt debt) {
        int size = stroage.getInt("size", 0);
        SharedPreferences.Editor editor = stroage.edit();
        editor.putString("name" + size, debt.name);
        editor.putInt("money" + size, debt.money);
        editor.putInt("size", size + 1);
        editor.apply();
    }

    @Override
    public Debt get(int id) {
        String name = stroage.getString("name" + id, "");
        int money = stroage.getInt("money" + id, 0);
        return new Debt(id, name, money);
    }

    @Override
    public List<Debt> getAll() {
        int size = stroage.getInt("size", 0);
        ArrayList<Debt> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(get(i));
        }
        return list;
    }
}
