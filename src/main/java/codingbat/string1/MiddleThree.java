package codingbat.string1;

public class MiddleThree {

    public static String middleThree(final String str) {
        final var n = str.length();
        return str.substring(n / 2 - 1, n / 2 + 2);
    }
}