package codingbat.array2;

public class FizzBuzz {

    public static String[] fizzBuzz(final int start, final int end) {
        final var out = new String[end - start];
        for (int i = start, j = 0; i < end; i++, j++) {
            if (i % 3 == 0 && i % 5 == 0) {
                out[j] = "FizzBuzz";
            } else if (i % 3 == 0) {
                out[j] = "Fizz";
            } else if (i % 5 == 0) {
                out[j] = "Buzz";
            } else {
                out[j] = Integer.toString(i);
            }
        }
        return out;
    }
}