package codingbat.ap1;

public class ScoresClump {

    public static boolean scoresClump(final int[] scores) {
        for (var i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i] <= 2) return true;
        }
        return false;
    }
}