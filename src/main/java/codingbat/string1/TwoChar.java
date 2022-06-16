package codingbat.string1;

public class TwoChar {

    public static String twoChar(final String str, final int index) {
        final var p = index >= 0 && index <= str.length() - 2 ? index : 0;
        return str.substring(p, p + 2);
    }
}