package codingbat.logic2;

public class LoneSum {

    public static int loneSum(final int a, final int b, final int c) {
        if (a == b && b == c) return 0;
        if (a == b) return c;
        if (b == c) return a;
        if (a == c) return b;
        return a + b + c;
    }
}