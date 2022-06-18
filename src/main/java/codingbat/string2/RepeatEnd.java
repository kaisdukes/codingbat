package codingbat.string2;

public class RepeatEnd {

    public static String repeatEnd(final String str, final int n) {
        final var out = new StringBuilder();
        final var part = str.substring(str.length() - n);
        for (var i = 0; i < n; i++) {
            out.append(part);
        }
        return out.toString();
    }
}