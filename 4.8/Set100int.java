package com.company;

// Элементы в одном экземпляре
// Быстрая проверка на наличие элемента

import java.util.Arrays;

public class Set100int {

    boolean[] a = new boolean[101];

    public Set100int() {
        Arrays.fill(a, false);
    }

    public boolean add(int data) {
        if (data < 0 || data > 100) return false;
        if (a[data])
            return false;
        a[data] = true;
        return true;//  36^32
    }

    public boolean contains(int data) {
        return a[data];
    }

    @Override
    public String toString() {
        return "Set100int{" +
                "a=" + a.toString() +
                '}';
    }
}
