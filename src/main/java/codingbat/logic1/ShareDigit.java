package codingbat.logic1;

public class ShareDigit {

    public static boolean shareDigit(final int a, final int b) {
        final var a1 = a / 10;
        final var a2 = a % 10;
        final var b1 = b / 10;
        final var b2 = b % 10;
        return a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2;
    }
}