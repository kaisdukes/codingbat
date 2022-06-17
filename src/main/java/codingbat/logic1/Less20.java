package codingbat.logic1;

public class Less20 {

    public static boolean less20(final int n) {
        final var a = n % 20;
        return a == 18 || a == 19;
    }
}