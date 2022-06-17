package codingbat.logic2;

public class LuckySum {

    public static int luckySum(final int a, final int b, final int c) {
        if (a == 13) return 0;
        if (b == 13) return a;
        if (c == 13) return a + b;
        return a + b + c;
    }
}