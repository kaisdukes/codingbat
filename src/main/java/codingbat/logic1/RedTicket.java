package codingbat.logic1;

public class RedTicket {

    public static int redTicket(final int a, final int b, final int c) {
        if (a == 2 && b == 2 && c == 2) return 10;
        if (a == b && b == c) return 5;
        if (b != a && c != a) return 1;
        return 0;
    }
}