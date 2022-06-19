package codingbat.ap1;

import static java.lang.Math.max;

public class ScoresAverage {

    public static int scoresAverage(final int[] scores) {
        final var n = scores.length;
        final var a = average(scores, 0, n / 2 - 1);
        final var b = average(scores, n / 2, scores.length - 1);
        return max(a, b);
    }

    private static int average(final int[] scores, final int start, final int end) {
        var sum = 0;
        for (var i = start; i <= end; i++) {
            sum += scores[i];
        }
        return sum / (end - start + 1);
    }
}