package com.company;

import java.util.ArrayList;

public class MyHashSet<T> {

    ArrayList<T>[] array;
    int capacity;

    public MyHashSet(int capacity) {
        array = new ArrayList[capacity];
        for (int i = 0; i < capacity; i++)
            array[i] = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean add(T data) {
        int hash = data.hashCode();
        int index = hash % capacity;
        if (!array[index].contains(data)) {
            array[index].add(data);
            return true;
        }
        return false;
    }

    public boolean contains(T data) {
        int hash = data.hashCode();
        int index = hash % capacity;
        return array[index].contains(data);
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < capacity; i++) {
            buffer.append(i + ": " + array[i].toString() + "\n"); // 0: [1,3,5]
            // 1: [2,4,6]
        }
        return buffer.toString();
    }
}
