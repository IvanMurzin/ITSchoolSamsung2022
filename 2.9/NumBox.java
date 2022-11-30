package org.example;

public class NumBox<T extends Number> {
    private T data;

    public NumBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
