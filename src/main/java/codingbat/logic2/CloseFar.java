package codingbat.logic2;

import static java.lang.Math.abs;

public class CloseFar {

    public static boolean closeFar(final int a, final int b, final int c) {
        return (close(a, b) && far(c, a) && far(c, b))
                || (close(a, c) && far(b, a) && far(b, c));
    }

    private static boolean close(final int a, final int b) {
        return abs(a - b) <= 1;
    }

    private static boolean far(final int a, final int b) {
        return abs(a - b) >= 2;
    }
}