package codingbat.string2;

public class RepeatFront {

    public static String repeatFront(final String str, final int n) {
        final var out = new StringBuilder();
        for (var i = n; i > 0; i--) {
            out.append(str.substring(0, i));
        }
        return out.toString();
    }
}