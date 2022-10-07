public class Main {

    static void printArray(int[][] a) {
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    static int getRandomInt(int min, int max) {
        return (int) Math.random() * (max - min) + min; // [0, 1)
    }

    public static void main(String[] args) {
        System.out.println(getRandomInt(-123, 10));
        System.out.println(getRandomInt(-123, 10));
        System.out.println(getRandomInt(-123, 10));
        System.out.println(getRandomInt(-123, 10));
        System.out.println(getRandomInt(-123, 10));
        int[][] a = new int[5][5]; // прямоугольный
        int k = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] =
            }
        }
        printArray(a);

    }
}