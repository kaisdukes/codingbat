package codingbat.logic1;

public class SortaSum {
    public static int sortaSum(final int a, final int b) {
        final var sum = a + b;
        return sum >= 10 && sum <= 19 ? 20 : sum;
    }
}