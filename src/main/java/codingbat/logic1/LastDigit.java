package codingbat.logic1;

public class LastDigit {

    public static boolean lastDigit(final int a, final int b, final int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;
    }
}