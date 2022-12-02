import java.util.Scanner;

public class NumReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isNegative = n < 0;
        if (isNegative) n = -n;
        int result = 0;
        while (n > 0) {
            result *= 10;
            result += n % 10;
            n /= 10;
        }
        if (isNegative) result = -result;
        System.out.println(result);
    }
}
