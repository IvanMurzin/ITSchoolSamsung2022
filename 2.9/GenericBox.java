package org.example;

public class GenericBox<T> {
    private T data;

    public GenericBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        if (data == null) return;
        this.data = data;
    }
}
