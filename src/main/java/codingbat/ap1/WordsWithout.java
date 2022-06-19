package codingbat.ap1;

public class WordsWithout {

    public static String[] wordsWithout(final String[] words, final String target) {
        var n = 0;
        for (final var word : words) {
            if (!word.equals(target)) n++;
        }
        final var out = new String[n];
        var i = 0;
        for (final var word : words) {
            if (!word.equals(target)) out[i++] = word;
        }
        return out;
    }
}