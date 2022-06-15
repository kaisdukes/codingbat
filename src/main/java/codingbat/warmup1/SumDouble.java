package codingbat.warmup1;

public class SumDouble {

    public static int sumDouble(final int a, final int b) {
        final var sum = a + b;
        return a == b ? sum * 2 : sum;
    }
}