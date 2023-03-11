package ru.ivanmurzin.debts.database.room;


import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {DebtEntity.class}, version = 1)
public abstract class Database extends RoomDatabase {
    public abstract DebtDAO debtDAO();
}
