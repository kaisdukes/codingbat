package codingbat.ap1;

public class ScoreUp {

    public static int scoreUp(final String[] key, final String[] answers) {
        var score = 0;
        for (var i = 0; i < key.length; i++) {
            if (!answers[i].equals("?")) {
                score += answers[i].equals(key[i]) ? 4 : -1;
            }
        }
        return score;
    }
}