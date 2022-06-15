package codingbat.warmup2;

public class StringYak {

    public static String stringYak(final String str) {
        final var out = new StringBuilder();
        for (var i = 0; i < str.length(); i++) {
            if (i < str.length() - 2 && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2;
            } else {
                out.append(str.charAt(i));
            }
        }
        return out.toString();
    }
}