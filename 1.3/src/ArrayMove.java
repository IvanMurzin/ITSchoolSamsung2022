import java.util.Scanner;

public class ArrayMove {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) array[i] = in.nextInt();
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }
}
