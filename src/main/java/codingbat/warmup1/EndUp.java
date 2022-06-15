package codingbat.warmup1;

public class EndUp {

    public static String endUp(final String str) {
        final var n = str.length();
        return n <= 3
                ? str.toUpperCase()
                : str.substring(0, n - 3) + str.substring(n - 3).toUpperCase();
    }
}