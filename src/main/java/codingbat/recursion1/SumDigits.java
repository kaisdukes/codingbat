package codingbat.recursion1;

public class SumDigits {

    public static int sumDigits(final int n) {
        return n == 0 ? 0 : n % 10 + sumDigits(n / 10);
    }
}