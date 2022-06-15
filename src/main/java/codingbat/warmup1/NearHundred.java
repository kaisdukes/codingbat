package codingbat.warmup1;

import static java.lang.Math.abs;

public class NearHundred {

    public static boolean nearHundred(final int n) {
        return abs(n - 100) <= 10 || abs(n - 200) <= 10;
    }
}