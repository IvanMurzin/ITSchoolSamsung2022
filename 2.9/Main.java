package org.example;

import java.io.Serializable;
import java.util.*;

public class Main {

    public static void someMethod(int[] a) {
        a[0] = 100;
        int[] b = {5, 4, 8};
        a = b;
    }

    public static void someMethod(boolean b) {
        if (b) return;
        System.out.println("asd");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) continue; // goto
            System.out.println(i);
        }
    }


    class A {
        public final String s; // null

        public A(String s) {
            this.s = s;
        }
    }

}

