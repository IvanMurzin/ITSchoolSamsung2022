import java.util.Scanner;


/**
 * Тернарный оператор и свитч кейз - условные конструкции!
 * А уж тем более нельзя использовать цикл while!
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n + 2 - (n % 2));
    }
}
