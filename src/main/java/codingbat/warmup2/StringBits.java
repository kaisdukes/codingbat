package codingbat.warmup2;

public class StringBits {

    public static String stringBits(final String str) {
        final var out = new StringBuilder();
        for (var i = 0; i < str.length(); i += 2) {
            out.append(str.charAt(i));
        }
        return out.toString();
    }
}