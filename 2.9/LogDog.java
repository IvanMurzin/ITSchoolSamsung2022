package org.example;

public class LogDog implements Logger {
    private String name;
    private String smell = "Cool";

    public LogDog(String name) {
        this.name = name;
    }

    @Override
    public void log() {
        System.out.println("I am dog: " + name + " which smells like" + smell);
    }
}
