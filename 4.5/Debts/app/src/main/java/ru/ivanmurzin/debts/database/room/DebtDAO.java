package ru.ivanmurzin.debts.database.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
@Dao
public interface DebtDAO {

    @Query("SELECT * FROM DebtEntity")
    List<DebtEntity> getAll();

    @Insert
    void save(DebtEntity debt);

    @Query("SELECT * FROM DebtEntity WHERE id = :id")
    DebtEntity getId(int id);
}
