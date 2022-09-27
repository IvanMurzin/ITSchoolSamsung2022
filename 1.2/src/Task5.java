import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i1 = in.nextInt();
        int i2 = in.nextInt();
        int i3 = in.nextInt();
        int count = 0;
        // Орицательные числа! или Math.abs
        if (i1 / 100 != 0 && i1 / 1000 == 0 && i1 % 5 == 0) ++count;
        if (i2 / 100 != 0 && i2 / 1000 == 0 && i2 % 5 == 0) ++count;
        if (i3 / 100 != 0 && i3 / 1000 == 0 && i3 % 5 == 0) ++count;
        System.out.println(count >= 2);
    }
}
