package codingbat.ap1;

import java.util.List;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class WordsWithoutList {

    public static List<String> wordsWithoutList(final String[] words, final int len) {
        return stream(words)
                .filter(x -> x.length() != len)
                .collect(toList());
    }
}