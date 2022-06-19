package codingbat.array3;

public class SquareUp {

    public static int[] squareUp(final int n) {
        final var array = new int[n * n];
        var k = 0;
        for (var i = 1; i <= n; i++) {
            k += n - i;
            for (var j = i; j >= 1; j--) {
                array[k++] = j;
            }
        }
        return array;
    }
}