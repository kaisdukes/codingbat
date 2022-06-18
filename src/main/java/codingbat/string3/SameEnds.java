package codingbat.string3;

public class SameEnds {

    public static String sameEnds(final String string) {
        for (var i = string.length() / 2; i > 0; i--) {
            final var part = string.substring(0, i);
            if (string.endsWith(part)) return part;
        }
        return "";
    }
}