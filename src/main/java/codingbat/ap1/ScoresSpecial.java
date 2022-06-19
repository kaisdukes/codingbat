package codingbat.ap1;

public class ScoresSpecial {

    public static int scoresSpecial(final int[] a, final int[] b) {
        return maxSpecialScore(a) + maxSpecialScore(b);
    }

    private static int maxSpecialScore(final int[] scores) {
        var max = 0;
        for (final var score : scores) {
            if (score % 10 == 0 && score > max) max = score;
        }
        return max;
    }
}