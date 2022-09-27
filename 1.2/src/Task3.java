import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int initSeconds = in.nextInt();
        int hours = initSeconds / 3600;
        int minutes = (initSeconds / 60) % 60;
        int seconds = initSeconds % 60;
        String stringHours = String.valueOf(hours); // hours + "";
        String stringMinutes = minutes < 10 ? "0" + minutes : String.valueOf(minutes);
        String stringSeconds = seconds < 10 ? "0" + seconds : String.valueOf(seconds);
        System.out.println(stringHours + ":" + stringMinutes + ":" + stringSeconds);
//        System.out.printf("%s:%s:%s", stringHours, stringMinutes, stringSeconds);
    }
}
