package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class Word0 {

    public static Map<String, Integer> word0(final String[] strings) {
        final var map = new HashMap<String, Integer>();
        for (final String str : strings) {
            if (!map.containsKey(str)) {
                map.put(str, 0);
            }
        }
        return map;
    }
}