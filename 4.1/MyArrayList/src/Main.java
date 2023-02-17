import java.util.Comparator;

public class Main {

    public static int binarySearch(int[] a, int key, int low, int hi) {
        if (low > hi) throw new IllegalArgumentException("Low > hi!");
        if (low < 0 || hi >= a.length) throw new IllegalArgumentException("Incorrect indexes");
        int mid = 0;
        int iters = 0;
        while (low <= hi) {
            ++iters;
            mid = (low + hi) / 2;
            int value = a[mid];
            if (value == key) {
                System.out.println(iters);
                return mid;
            }
            if (key > value) low = mid + 1;
            else hi = mid - 1;

        }
        System.out.println(iters);
        return -(low + 1);
    }

    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 40, 50, 60, 70};
//        int index = binarySearch(a, 0, 0, a.length - 1);
//        Cat[] cats = {new Cat(), new Cat(), new Cat()};
//        Arrays.binarySearch(cats, new Cat(), (o1, o2) -> Long.compare(o1.tail, o2.tail));
//        ArrayList a;
//        a.add()
        MyArrayList<String> list = new MyArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("qwe");
        list.add("qert");
        list.add("rty");
        list.add("fkpd");

        list.set(4, "hello");
        list.set(12, "world!");

        list.remove(4);
        list.remove(5);
        list.remove(6);
        for (String s : list) {
            System.out.println(s);
        }
 

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("1");
//        arrayList.add("2");
//        arrayList.add("3");
//        arrayList.add("4");
//        arrayList.add("5");
//        arrayList.add("6");
//        arrayList.add("7");
//        arrayList.add("8");
//        arrayList.add("9");
//        arrayList.add("10");
//        arrayList.add("qwe");
//        arrayList.add("qert");
//        arrayList.add("rty");
//        Iterator<String> iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            String value = iterator.next();
//            System.out.println(value);
//        }

    }

}

class Cat implements Comparable<Cat> {
    long tail;
    String name;

    @Override
    public int compareTo(Cat o) {
        return 0;
    }
}

class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.tail < o2.tail) return -1;
        else if (o1.tail > o2.tail) return 1;
        return 0;
    }
}