package codingbat.string1;

public class Right2 {

    public static String right2(final String str) {
        final var n = str.length();
        return str.substring(n - 2) + str.substring(0, n - 2);
    }
}