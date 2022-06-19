package codingbat.ap1;

import static java.lang.Math.abs;

public class BigHeights {

    public static int bigHeights(final int[] heights, final int start, final int end) {
        var count = 0;
        for (var i = start; i < end; i++) {
            if (abs(heights[i + 1] - heights[i]) >= 5) count++;
        }
        return count;
    }
}