package codingbat.warmup2;

public class FrontTimes {

    public static String frontTimes(final String str, final int n) {
        final var front = str.length() <= 3 ? str : str.substring(0, 3);
        return front.repeat(n);
    }
}