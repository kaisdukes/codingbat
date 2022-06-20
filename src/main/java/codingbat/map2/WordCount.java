package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static Map<String, Integer> wordCount(final String[] strings) {
        final var map = new HashMap<String, Integer>();
        for (final var str : strings) {
            map.put(str, map.containsKey(str) ? map.get(str) + 1 : 1);
        }
        return map;
    }
}