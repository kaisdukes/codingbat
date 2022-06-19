package codingbat.ap1;

public class DividesSelf {

    public static boolean dividesSelf(final int n) {
        if (n == 0) return false;
        var r = n;
        while (r != 0) {
            final var digit = r % 10;
            if (digit == 0 || n % digit != 0) return false;
            r /= 10;
        }
        return true;
    }
}