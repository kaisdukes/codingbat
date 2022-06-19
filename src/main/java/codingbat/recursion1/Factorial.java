package codingbat.recursion1;

public class Factorial {

    public static int factorial(final int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}