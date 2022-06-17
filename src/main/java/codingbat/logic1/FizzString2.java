package codingbat.logic1;

public class FizzString2 {

    public static String fizzString2(final int n) {
        final var a = n % 3 == 0;
        final var b = n % 5 == 0;
        return a && b ? "FizzBuzz!" : a ? "Fizz!" : b ? "Buzz!" : n + "!";
    }
}