package codingbat.warmup1;

import static java.lang.Math.max;

public class Max1020 {

    public static int max1020(final int a, final int b) {
        final var aInRange = a >= 10 && a <= 20;
        final var bInRange = b >= 10 && b <= 20;
        if (aInRange && bInRange) return max(a, b);
        return aInRange
                ? a
                : bInRange ? b : 0;
    }
}