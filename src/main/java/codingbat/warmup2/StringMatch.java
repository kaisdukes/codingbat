package codingbat.warmup2;

import static java.lang.Math.min;

public class StringMatch {

    public static int stringMatch(final String a, final String b) {
        var count = 0;
        final var n = min(a.length(), b.length());
        for (var i = 0; i < n - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) count++;
        }
        return count;
    }
}