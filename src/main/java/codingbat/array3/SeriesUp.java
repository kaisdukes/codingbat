package codingbat.array3;

public class SeriesUp {

    public static int[] seriesUp(final int n) {
        final var array = new int[n * (n + 1) / 2];
        var k = 0;
        for (var i = 1; i <= n; i++) {
            for (var j = 1; j <= i; j++) {
                array[k++] = j;
            }
        }
        return array;
    }
}