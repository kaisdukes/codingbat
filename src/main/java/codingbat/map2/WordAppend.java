package codingbat.map2;

import java.util.HashMap;

public class WordAppend {

    public static String wordAppend(final String[] strings) {
        final var out = new StringBuilder();
        final var map = new HashMap<String, Integer>();
        for (final var str : strings) {
            final var count = map.containsKey(str) ? map.get(str) + 1 : 1;
            map.put(str, count);
            if (count >= 2 && count % 2 == 0) {
                out.append(str);
            }
        }
        return out.toString();
    }
}