package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {

    public static Map<String, String> pairs(final String[] strings) {
        final var map = new HashMap<String, String>();
        for (final var str : strings) {
            map.put(str.substring(0, 1), str.substring(str.length() - 1));
        }
        return map;
    }
}