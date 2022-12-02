import java.util.Scanner;

public class RemoveDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int removeDigit = in.nextInt();
        int result = 0;
        int tens = 1;
        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;
            if (removeDigit == lastDigit) continue;
            result += lastDigit * tens;
            tens *= 10;
            System.out.println(result);
        }
        System.out.println(result);
    } // 1234 = 1*1000 + 2*100 + 3*10 + 4*1
}
