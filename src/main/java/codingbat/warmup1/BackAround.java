package codingbat.warmup1;

public class BackAround {

    public static String backAround(final String str) {
        final var ch = str.charAt(str.length() - 1);
        return ch + str + ch;
    }
}