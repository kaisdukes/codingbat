package codingbat.warmup1;

public class PosNeg {

    public static boolean posNeg(final int a, final int b, final boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        }
        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }
}