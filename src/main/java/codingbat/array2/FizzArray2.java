package codingbat.array2;

public class FizzArray2 {

    public static String[] fizzArray2(final int n) {
        final var array = new String[n];
        for (var i = 0; i < n; i++) {
            array[i] = Integer.toString(i);
        }
        return array;
    }
}