import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("text.txt");
        PrintWriter printWriter = new PrintWriter(fos);
        printWriter.println(123);
        printWriter.close();
//        System.out.println(file.exists());
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.canExecute());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getPath());
//        System.out.println(file.getParent());
//        System.out.println(file.isDirectory());
//        System.out.println(file.getParentFile().isDirectory());
//        System.out.println(file.length());
    }


    public static void first() throws Exception {
        System.out.println("first start");
        second();
        System.out.println("first end");
    }

    public static void second() throws Exception {
        System.out.println("second start");
        third();
        System.out.println("second end");
    }

    public static void third() throws Exception {
        System.out.println("third start");
        if (true) throw new Exception("Some exception");
        System.out.println("third end");
    }
}


class MyCatException extends RuntimeException {
    public MyCatException() {
        super("My cat is broken");
    }

    public MyCatException(Throwable cause) {
        super(cause);
    }
}

class MyDogException extends RuntimeException {
    public MyDogException() {
        super("My dog is broken");
    }
}


class Cat {
    int paws = 4;

    public void setPaws(int paws) {
        if (paws < 0) throw new MyCatException();
        if (paws > 4) throw new RuntimeException("Paws more than 5");
        System.out.println("paws=" + paws);
        this.paws = paws;
    }

    @Override
    public String toString() {
        return "Cat with paws=" + paws;
    }
}