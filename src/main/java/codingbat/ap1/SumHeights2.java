package codingbat.ap1;

public class SumHeights2 {

    public static int sumHeights2(final int[] heights, final int start, final int end) {
        var sum = 0;
        for (var i = start; i < end; i++) {
            final var delta = heights[i + 1] - heights[i];
            sum += delta > 0 ? delta * 2 : -delta;
        }
        return sum;
    }
}