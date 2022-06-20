package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public static Map<String, Boolean> wordMultiple(final String[] strings) {
        final var map = new HashMap<String, Boolean>();
        for (final var str : strings) {
            map.put(str, map.containsKey(str));
        }
        return map;
    }
}