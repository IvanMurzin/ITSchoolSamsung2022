import java.util.Scanner;

public class HappyPelmen {
    /**
     * Вводятся номера пельеней
     * Если номер 5 - он счастливый, завершаем
     * Иначе продолжаем
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int n = in.nextInt(); n != 5; n = in.nextInt()) {
            System.out.println("Не тот :( Ищем дальше");
        }
        System.out.println("Ура! Нашли счастливый!");
    }
}
