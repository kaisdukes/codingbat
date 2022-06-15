package codingbat.warmup2;

public class AltPairs {

    public static String altPairs(final String str) {
        final var out = new StringBuilder();
        var i = 0;
        while (i < str.length()) {
            out.append(str.charAt(i));
            i += i % 2 == 0 ? 1 : 3;
        }
        return out.toString();
    }
}