import java.util.BitSet;

public class Req {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (long i = 0; i < 5_000_0; ++i) ;
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        start = System.currentTimeMillis();
        inc(0);
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    static void inc(long i) {
        if (i == 5_000_0) return;
        inc(i + 1);
    }
}
