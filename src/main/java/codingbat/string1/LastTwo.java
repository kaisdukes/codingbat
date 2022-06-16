package codingbat.string1;

public class LastTwo {

    public static String lastTwo(final String str) {
        final var n = str.length();
        if (n < 2) return str;
        return str.substring(0, n - 2) + str.charAt(n - 1) + str.charAt(n - 2);
    }
}