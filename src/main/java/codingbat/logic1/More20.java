package codingbat.logic1;

public class More20 {

    public static boolean more20(final int n) {
        final var a = n % 20;
        return a == 1 || a == 2;
    }
}