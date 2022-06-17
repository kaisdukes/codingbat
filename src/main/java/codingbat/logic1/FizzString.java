package codingbat.logic1;

public class FizzString {

    public static String fizzString(final String str) {
        final var f = str.startsWith("f");
        final var b = str.endsWith("b");
        return f && b ? "FizzBuzz" : f ? "Fizz" : b ? "Buzz" : str;
    }
}