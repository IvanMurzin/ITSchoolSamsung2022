package ru.ivanmurzin.debts.database;

import java.util.List;

import ru.ivanmurzin.debts.database.model.Debt;

public interface DebtsDatabase {
    void save(Debt debt);

    Debt get(int id);

    List<Debt> getAll();
}
