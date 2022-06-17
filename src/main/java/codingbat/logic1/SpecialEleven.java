package codingbat.logic1;

public class SpecialEleven {

    public static boolean specialEleven(final int n) {
        final var a = n % 11;
        return a == 0 || a == 1;
    }
}