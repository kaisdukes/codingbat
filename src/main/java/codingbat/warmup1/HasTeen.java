package codingbat.warmup1;

public class HasTeen {

    public static boolean hasTeen(final int a, final int b, final int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }
}