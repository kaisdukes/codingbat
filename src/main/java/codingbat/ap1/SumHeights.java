package codingbat.ap1;

import static java.lang.Math.abs;

public class SumHeights {

    public static int sumHeights(final int[] heights, final int start, final int end) {
        var sum = 0;
        for (var i = start; i < end; i++) {
            sum += abs(heights[i + 1] - heights[i]);
        }
        return sum;
    }
}