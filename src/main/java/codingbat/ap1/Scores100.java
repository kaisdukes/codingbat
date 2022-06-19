package codingbat.ap1;

public class Scores100 {

    public static boolean scores100(final int[] scores) {
        for (var i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) return true;
        }
        return false;
    }
}