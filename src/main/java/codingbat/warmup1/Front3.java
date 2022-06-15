package codingbat.warmup1;

import static java.lang.Math.min;

public class Front3 {

    public static String front3(final String str) {
        final var front = str.substring(0, min(str.length(), 3));
        return front + front + front;
    }
}