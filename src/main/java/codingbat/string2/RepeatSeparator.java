package codingbat.string2;

public class RepeatSeparator {

    public static String repeatSeparator(final String word, final String sep, final int count) {
        final var out = new StringBuilder();
        for (var i = 0; i < count; i++) {
            if (i > 0) out.append(sep);
            out.append(word);
        }
        return out.toString();
    }
}