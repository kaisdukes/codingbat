package codingbat.recursion1;

public class Fibonacci {

    public static int fibonacci(final int n) {
        return n <= 1 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}