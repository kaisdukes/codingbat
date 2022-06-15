package codingbat.warmup1;

public class FrontBack {

    public static String frontBack(final String str) {
        final var n = str.length();
        final var out = new StringBuilder();
        if (n > 0) out.append(str.charAt(n - 1));
        if (n > 2) out.append(str, 1, n - 1);
        if (n > 1) out.append(str.charAt(0));
        return out.toString();
    }
}