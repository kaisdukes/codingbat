package codingbat.logic2;

public class RoundSum {

    public static int roundSum(final int a, final int b, final int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private static int round10(final int num) {
        final var n = 10 * (num / 10);
        return num % 10 >= 5 ? n + 10 : n;
    }
}