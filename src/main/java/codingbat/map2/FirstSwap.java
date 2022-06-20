package codingbat.map2;

import java.util.HashMap;

public class FirstSwap {

    public static String[] firstSwap(final String[] strings) {
        final var map = new HashMap<Character, Integer>();
        for (var i = 0; i < strings.length; i++) {
            final var key = strings[i].charAt(0);
            if (map.containsKey(key)) {
                final var index = map.get(key);
                if (index >= 0) {
                    final var temp = strings[i];
                    strings[i] = strings[index];
                    strings[index] = temp;
                }
                map.put(key, -1);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }
}