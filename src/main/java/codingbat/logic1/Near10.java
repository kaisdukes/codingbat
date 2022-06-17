package codingbat.logic1;

public class Near10 {

    public static boolean near10(final int num) {
        final var a = num % 10;
        return a <= 2 || a >= 8;
    }
}