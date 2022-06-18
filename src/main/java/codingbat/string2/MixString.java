package codingbat.string2;

import static java.lang.Math.max;

public class MixString {

    public static String mixString(final String a, final String b) {
        final var n1 = a.length();
        final var n2 = b.length();
        final var n = max(n1, n2);
        final var out = new StringBuilder();
        for (var i = 0; i < n; i++) {
            if (i < n1) out.append(a.charAt(i));
            if (i < n2) out.append(b.charAt(i));
        }
        return out.toString();
    }
}