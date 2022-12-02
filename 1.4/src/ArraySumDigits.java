import java.util.Scanner;

public class ArraySumDigits {
    /**
     * Найти сумму всех чисел всех элементов массива
     * 5
     * 12 34 10 2 32
     * 18
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        int result = 0;
        SumDigits summer = new SumDigits();
        for (int item : a) {
            result += summer.sumDigits(item);
        }
        System.out.println(result);
    }
}
