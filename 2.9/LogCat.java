package org.example;

public class LogCat implements Logger, Comparable<LogCat> {
    private String name;
    private int paws;

    public LogCat(String name, int paws) {
        this.name = name;
        this.paws = paws;
    }

    @Override
    public void log() {
        System.out.println("I am cat: " + name + " with paws=" + paws);
    }

    @Override
    public int compareTo(LogCat o) {
        return 0;
    }
}
