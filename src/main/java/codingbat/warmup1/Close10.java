package codingbat.warmup1;

import static java.lang.Math.abs;

public class Close10 {

    public static int close10(final int a, final int b) {
        final var deltaA = abs(a - 10);
        final var deltaB = abs(b - 10);
        return deltaA == deltaB
                ? 0
                : deltaA < deltaB ? a : b;
    }
}