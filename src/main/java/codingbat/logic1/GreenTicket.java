package codingbat.logic1;

public class GreenTicket {

    public static int greenTicket(final int a, final int b, final int c) {
        if (a == b && b == c) return 20;
        if (a == b || b == c || a == c) return 10;
        return 0;
    }
}