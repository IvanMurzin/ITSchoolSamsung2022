package ru.ivanmurzin.debts.database.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import ru.ivanmurzin.debts.database.DebtsDatabase;
import ru.ivanmurzin.debts.database.model.Debt;

public class DebtsDatabaseSQL extends SQLiteOpenHelper implements DebtsDatabase {
    private static final String DB_NAME = "debtss.db";
    private static final String TABLE_NAME = "Debts";

    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_MONEY = "money";


    public DebtsDatabaseSQL(@Nullable Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("RRR", "CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID + " INTEGER PRIMARY KEY, " + COLUMN_NAME + " VARCHAR, " + COLUMN_MONEY + " INTEGER" + ");");
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID + " INTEGER PRIMARY KEY, " + COLUMN_NAME + " VARCHAR, " + COLUMN_MONEY + " INTEGER" + ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_NAME + ";");
        onCreate(db);
    }

    @Override
    public void save(Debt debt) {
        SQLiteDatabase db = getWritableDatabase();
//        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COLUMN_ID + ", " + COLUMN_NAME + ", " + COLUMN_MONEY + ") VALUES (" + debt.id + ", " + debt.name + ", " + debt.money + ");");
        // insert into table_name (id,name,money) (1,"kek", 100);
        ContentValues values = new ContentValues();
        values.put(COLUMN_ID, debt.id);
        values.put(COLUMN_NAME, debt.name);
        values.put(COLUMN_MONEY, debt.money);
        db.insert(TABLE_NAME, null, values);
    }

    @Override
    public Debt get(int id) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, null, null, null, null, null, null);
        cursor.moveToPosition(id);
        int nameIndex = cursor.getColumnIndex(COLUMN_NAME);
        int moneyIndex = cursor.getColumnIndex(COLUMN_MONEY);
        String name = cursor.getString(nameIndex);
        int money = cursor.getInt(moneyIndex);
        cursor.close();
        return new Debt(id, name, money);
    }

    @Override
    public List<Debt> getAll() {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, null, null, null, null, null, null);
        List<Debt> list = new ArrayList<>();
        if (cursor.moveToFirst()) {
            Log.d("RRR", "getAll: move");
            do {
                int nameIndex = cursor.getColumnIndex(COLUMN_NAME);
                int moneyIndex = cursor.getColumnIndex(COLUMN_MONEY);
                int idIndex = cursor.getColumnIndex(COLUMN_ID);
                String name = cursor.getString(nameIndex);
                int money = cursor.getInt(moneyIndex);
                int id = cursor.getInt(idIndex);
                Log.d("RRR", "getAll: " + id);
                list.add(new Debt(id, name, money));
            } while (cursor.moveToNext());
        }
        cursor.close();
        Log.d("RRR", "getAll:" + list.size());
        return list;
    }
}
