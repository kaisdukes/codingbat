package codingbat.array2;

public class FizzArray3 {

    public static int[] fizzArray3(final int start, final int end) {
        final var n = end - start;
        final var array = new int[n];
        for (var i = 0; i < n; i++) {
            array[i] = start + i;
        }
        return array;
    }
}