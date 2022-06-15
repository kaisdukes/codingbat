package codingbat.warmup1;

public class MissingChar {

    public static String missingChar(final String str, final int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
}