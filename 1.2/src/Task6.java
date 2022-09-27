import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();
        boolean belowParabola = y <= 2 - x * x; // Math.pow(x,2)
        boolean aboveLine = y >= x;
        boolean inSector = y >= 0 && belowParabola;
        System.out.println(belowParabola && aboveLine || inSector);
    }
}
