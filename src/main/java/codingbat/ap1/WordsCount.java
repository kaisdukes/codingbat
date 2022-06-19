package codingbat.ap1;

public class WordsCount {

    public static int wordsCount(final String[] words, final int len) {
        var count = 0;
        for (final var word : words) {
            if (word.length() == len) count++;
        }
        return count;
    }
}