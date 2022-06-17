package codingbat.logic1;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MaxMod5 {

    public static int maxMod5(final int a, final int b) {
        return a == b ? 0 : a % 5 == b % 5 ? min(a, b) : max(a, b);
    }
}