import java.util.Scanner;

public class HW {

    // n
    // n bool -> byte[] 00000000 00000000 00000000 00000000 00000000 00000000
    // boolean == 1 or 0(true or false)
    // byte == boolean[8]
    // 10000001 | 00010000 == 10010001
    // 1 << 4 ==  00010000
    // 10000001 & 00010000 == 0
    // 10010001 & 00010000 == 00010000 != 0
    // 31 false false

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int k = 0;
        int newLength = n / 8 + 1;
        byte[] b = new byte[newLength];
        extern:
        for (int i = 0; i < newLength; i++) {
            for (int j = 7; j >= 0; j--) {
                boolean input = in.nextBoolean();
                k++;
                if (input) {
                    int mask = 1 << j; // 10000000 01000000 00100000
                    b[i] |= mask; // b[i] = b[i] | mask;
                }
                if (k == n) break extern;
            }
        }

        k = 0;
        extern:
        for (int i = 0; i < newLength; i++) {
            for (int j = 7; j >= 0; j--) {
                int mask = 1 << j;
                int result = (b[i] & mask);
                System.out.println(result != 0);
                k++;
                if (k == n) break extern;
            }
        }
    }
}
