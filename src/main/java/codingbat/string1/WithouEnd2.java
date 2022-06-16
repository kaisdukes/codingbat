package codingbat.string1;

public class WithouEnd2 {

    public static String withouEnd2(final String str) {
        final var n = str.length();
        return n <= 2 ? "" : str.substring(1, n - 1);
    }
}