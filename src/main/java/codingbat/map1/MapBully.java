package codingbat.map1;

import java.util.Map;

public class MapBully {

    public static Map<String, String> mapBully(final Map<String, String> map) {
        if (map.containsKey("a")) {
            final var value = map.get("a");
            map.put("a", "");
            map.put("b", value);
        }
        return map;
    }
}