package org.example;

public class LogBox<T extends Logger> {
    private T data;

    public LogBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void printInfo() {
        data.log();
    }
}
