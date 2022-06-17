package codingbat.logic1;

import static java.lang.Math.abs;

public class LessBy10 {

    public static boolean lessBy10(final int a, final int b, final int c) {
        return abs(a - b) >= 10 || abs(a - c) >= 10 || abs(b - c) >= 10;
    }
}