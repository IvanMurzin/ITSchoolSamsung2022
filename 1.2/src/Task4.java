import java.util.Scanner;

/**
 * & - бинарное и
 * && - логическое и
 * | - бинарное или
 * || - логическое или
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float point = in.nextFloat();
        boolean inFirst = point >= -2 && point <= 3;
        boolean inSecond = point >= 6 && point <= 9;
        System.out.println(!inFirst && !inSecond);
        // NOT: if (inInterval) System.out.println("true");
    }
}
