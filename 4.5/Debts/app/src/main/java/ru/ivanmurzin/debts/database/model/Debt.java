package ru.ivanmurzin.debts.database.model;

public class Debt { // pojo
    public int id;
    public String name;
    public int money;

    public Debt(int id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }
}
