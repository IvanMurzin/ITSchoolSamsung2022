import java.util.Arrays;
import java.util.Scanner;

public class SumDigits {
    /**
     * Принимает число
     * Возвращает сумму цифр
     * 12345 -> 15
     */

    public int sumDigits(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }

    void doSmt() {
        sumDigits(123);
        System.out.println("smt " + 123 * 123);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Math.abs(123);
//        SumDigits.sumDigits(123);
//        Scanner.nextInt();
        int i = in.nextInt();
        System.out.println();
    }
}