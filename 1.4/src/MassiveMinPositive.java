import java.util.Scanner;

public class MassiveMinPositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = in.nextInt();
        for (int i = 1; i < n; i++) {
            int item = in.nextInt();
            if (item > 0 && item < min || min < 0) {
                min = item;
            }
        }
        System.out.println(min);
    }
}
