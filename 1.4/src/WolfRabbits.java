import java.util.Scanner;

public class WolfRabbits {
    public static void main(String[] args) {
        int rabbits = 11;
        int wolves = 2;
        int totalEaten = 0;
        int n = new Scanner(System.in).nextInt();
        for (int month = 1; month <= n; month++) {
            if (month % 2 == 1) { // нечетный
                rabbits *= 3; // rabbits = rabbits * 3;
                if (rabbits > 19000000) rabbits = 19000000;
            } else {
                if (rabbits - wolves * 10 < 0) {
                    wolves -= (wolves - rabbits / 10);
                }
                int eatenRabbits = wolves * 10;
                totalEaten += eatenRabbits;
                rabbits -= eatenRabbits;
            }
            wolves += totalEaten / 70;
            totalEaten %= 70;
        }
        System.out.println("rabbits " + rabbits);
        System.out.println("wolves " + wolves);
    }
}