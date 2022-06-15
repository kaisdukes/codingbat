package codingbat.warmup1;

import static java.lang.Math.max;

public class IntMax {

    public static int intMax(final int a, final int b, final int c) {
        return max(a, (max(b, c)));
    }
}