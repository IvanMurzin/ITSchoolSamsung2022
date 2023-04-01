package ru.itschool;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void printTree(TreeSet<String> tree) {
        System.out.println("======= Tree =======");
        for (String s : tree) {
            System.out.println(s);
        }
        System.out.println();
    }

    /*
    Нужно найти список учеников, сдавших экзамен на оценку выше заданной.
    Реализовать класс Student.
    Решить с помощью TreeSet
     */

    public static void main(String[] args) {
//        TreeSet<String> tree = new TreeSet<>();
//        tree.add("abc");
//        tree.add("aba");
//        printTree(tree);
//
//        System.out.println(tree.remove("aaa"));
//        System.out.println(tree.remove("abc"));
//        printTree(tree);
//
//        tree.add("zzz");
//        tree.add("xyz");
//        tree.add("zca");
//        tree.add("zxc");
//
//        System.out.println(tree.contains("xyz"));
//        System.out.println(tree.contains("xxx"));
//        System.out.println(tree.contains("zzzz"));
//
//        printTree(tree);
//
//        System.out.println(tree.floor("zcb"));
//        System.out.println(tree.ceiling("zzzz"));
//
//        Set<String> set = tree.subSet("xyy", "zzy");
//
//        for (String s : set) {
//            System.out.print(s + " ");
//        }
        Student[] students = {
                new Student("Petr", 1, 5),
                new Student("Bob", 2, 4),
                new Student("Dmitriy", 1, 5),
                new Student("Andrey Borisovich", 3, 2),
                new Student("Martin", 455, 3),
                new Student("Rodion", 4, 3),
                new Student("Razumihin", 6, 5),
                new Student("Prokofiy", 7, 4),
                new Student("Alena Ivanovna", 1, -1),
        };

        TreeSet<Student> tree = new TreeSet<>(new StudentComparator());
        for (Student student : students) tree.add(student);
        Set<Student> studentSet = tree.tailSet(students[0], true);
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) { // o1 o2
        if (o1.mark > o2.mark) return 1;
        else if (o1.mark == o2.mark) {
            if (o1.name.equals(o2.name)) {
                return Integer.compare(o1.group, o2.group);
            } else return o1.name.compareTo(o2.name);
        }
        return -1;
    }

}
// Comparator - оr означет, что это кто-то(директор, корректор)
// Comparable - able означает, что умет это делать (играбельны)


class Student {
    String name;
    int group;
    int mark;

    public Student(String name, int group, int mark) {
        this.name = name;
        this.group = group;
        this.mark = mark;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", mark=" + mark +
                '}';
    }
}