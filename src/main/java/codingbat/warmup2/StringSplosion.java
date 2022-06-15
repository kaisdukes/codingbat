package codingbat.warmup2;

public class StringSplosion {

    public static String stringSplosion(final String str) {
        final var out = new StringBuilder();
        for (var i = 0; i < str.length(); i++) {
            out.append(str.substring(0, i + 1));
        }
        return out.toString();
    }
}