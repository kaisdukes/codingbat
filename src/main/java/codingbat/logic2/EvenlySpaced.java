package codingbat.logic2;

import static java.lang.Math.abs;

public class EvenlySpaced {

    public static boolean evenlySpaced(final int a, final int b, final int c) {
        final var ab = abs(a - b);
        final var ac = abs(a - c);
        final var bc = abs(b - c);
        return (a == b && b == c)
                || (ab == ac && b != c)
                || (ab == bc && a != c)
                || (ac == bc && a != b);
    }
}