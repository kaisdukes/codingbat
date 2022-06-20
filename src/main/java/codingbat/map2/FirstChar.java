package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {

    public static Map<String, String> firstChar(final String[] strings) {
        final var map = new HashMap<String, String>();
        for (final var str : strings) {
            final var key = str.substring(0, 1);
            map.put(key, map.containsKey(key) ? map.get(key) + str : str);
        }
        return map;
    }
}