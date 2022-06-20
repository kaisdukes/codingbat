package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordLen {

    public static Map<String, Integer> wordLen(final String[] strings) {
        final var map = new HashMap<String, Integer>();
        for (final var str : strings) {
            if (!map.containsKey(str)) {
                map.put(str, str.length());
            }
        }
        return map;
    }
}