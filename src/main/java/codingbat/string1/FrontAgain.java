package codingbat.string1;

public class FrontAgain {

    public static boolean frontAgain(final String str) {
        final var n = str.length();
        return n >= 2 && str.substring(0, 2).equals(str.substring(n - 2));
    }
}