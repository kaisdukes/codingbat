package codingbat.array2;

public class FizzArray {

    public static int[] fizzArray(final int n) {
        final var array = new int[n];
        for (var i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }
}