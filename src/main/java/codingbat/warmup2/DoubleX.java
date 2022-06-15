package codingbat.warmup2;

public class DoubleX {

    public static boolean doubleX(final String str) {
        final var i = str.indexOf('x');
        return i >= 0 && i < str.length() - 1 && str.charAt(i + 1) == 'x';
    }
}