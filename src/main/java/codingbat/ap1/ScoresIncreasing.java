package codingbat.ap1;

public class ScoresIncreasing {

    public static boolean scoresIncreasing(final int[] scores) {
        for (var i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) return false;
        }
        return true;
    }
}