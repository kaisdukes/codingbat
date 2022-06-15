package codingbat.warmup1;

import static java.lang.Math.abs;

public class Diff21 {

    public static int diff21(final int n) {
        final var diff = abs(n - 21);
        return n > 21 ? diff * 2 : diff;
    }
}