package org.example;

public class SortedBox {
    private Comparable<T>[] data;

    public SortedBox(T[] data) {
        this.data = data;
    }


    public void add(T value){
        for (T element : data) {
            if (element.compareTo(value) > 1){

            }
        }
    }
    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }
}
