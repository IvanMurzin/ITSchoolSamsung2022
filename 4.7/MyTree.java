package ru.itschool;

public class MyTree<T extends Comparable<T>> {

    T data;
    MyTree<T> leftChild;
    MyTree<T> rightChild;

    public MyTree(T value) {
        this.data = value;
        leftChild = null;
        rightChild = null;
    }

    public void add(T value) {
        if (value.compareTo(data) < 0) { // то отправляем налево
            if (leftChild != null) leftChild.add(value);
            else leftChild = new MyTree<T>(value);
        } else if (value.compareTo(data) > 0) { // то отправляем направо
            if (rightChild != null) rightChild.add(value);
            else rightChild = new MyTree<T>(value);
        }
    }

    public void printTree(int level) {
        if (leftChild != null) leftChild.printTree(level + 1);
        for (int i = 0; i < level; i++) System.out.print("    ");
        System.out.println(data);
        if (rightChild != null) rightChild.printTree(level + 1);
    }

    public void printTree() {
        printTree(0);
    }

    public void printAsArray() {
        if (leftChild != null) leftChild.printAsArray();
        System.out.print(data + " ");
        if (rightChild != null) rightChild.printAsArray();
    }

    public boolean contains(T value) { // O(log(n))
        if (value.compareTo(data) == 0) return true;
        if (value.compareTo(data) < 0) {
            if (leftChild != null)
                return leftChild.contains(value);
            return false;
        }
        if (value.compareTo(data) > 0) {
            if (rightChild != null)
                return rightChild.contains(value);
            return false;
        }
        return false;
    }
}
