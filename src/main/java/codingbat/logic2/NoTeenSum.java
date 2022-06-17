package codingbat.logic2;

public class NoTeenSum {

    public static int noTeenSum(final int a, final int b, final int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    private static int fixTeen(final int n) {
        return n == 13 || n == 14 || n == 17 || n == 18 || n == 19 ? 0 : n;
    }
}