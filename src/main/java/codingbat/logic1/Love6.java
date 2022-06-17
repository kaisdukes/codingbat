package codingbat.logic1;

import static java.lang.Math.abs;

public class Love6 {

    public static boolean love6(final int a, final int b) {
        return a == 6 || b == 6 || a + b == 6 || abs(a - b) == 6;
    }
}