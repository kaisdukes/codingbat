package codingbat.map2;

import java.util.HashMap;

public class AllSwap {

    public static String[] allSwap(final String[] strings) {
        final var map = new HashMap<Character, Integer>();
        for (var i = 0; i < strings.length; i++) {
            final var key = strings[i].charAt(0);
            if (map.containsKey(key)) {
                final var index = map.get(key);
                final var temp = strings[i];
                strings[i] = strings[index];
                strings[index] = temp;
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }
}