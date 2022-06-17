package codingbat.logic1;

public class TwoAsOne {

    public static boolean twoAsOne(final int a, final int b, final int c) {
        return a + b == c || a + c == b || b + c == a;
    }
}