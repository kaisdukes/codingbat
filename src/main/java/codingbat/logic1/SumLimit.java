package codingbat.logic1;

public class SumLimit {

    public static int sumLimit(final int a, final int b) {
        final var sum = a + b;
        final var digitsA = Integer.toString(a).length();
        final var digitsSum = Integer.toString(sum).length();
        return digitsSum > digitsA ? a : sum;
    }
}