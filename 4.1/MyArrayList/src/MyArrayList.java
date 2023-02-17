import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    private Object[] data;
    private int capacity; // real size
    private int size = 0; // fill size

    public int size() {
        return size;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public MyArrayList() {
        this(10);
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("index: " + index + " size: " + size);
        return (T) data[index];
    }

    public void set(int index, T value) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("index: " + index + " size: " + size);
        data[index] = value;
    }

    public void add(T value) {
        if (capacity == size) {
            capacity *= 1.5;
            Object[] newData = new Object[capacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size] = value;
        ++size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("index: " + index + " size: " + size);
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[size - 1] = null;
        --size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator();
    }


    private class MyArrayListIterator implements Iterator<T> {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public T next() {
            return (T) data[cursor++]; // data[cursor]; cursor++;
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(cursor);
        }
    }

}
