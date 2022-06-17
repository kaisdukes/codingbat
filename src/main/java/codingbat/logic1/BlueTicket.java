package codingbat.logic1;

import static java.lang.Math.abs;

public class BlueTicket {

    public static int blueTicket(final int a, final int b, final int c) {
        final var ab = a + b;
        final var bc = b + c;
        final var ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) return 10;
        if (abs(ab - bc) >= 10 || abs(ab - ac) >= 10) return 5;
        return 0;
    }
}