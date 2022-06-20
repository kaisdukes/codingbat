package codingbat.map1;

import java.util.Map;

public class MapShare {

    public static Map<String, String> mapShare(final Map<String, String> map) {
        if (map.containsKey("a")) map.put("b", map.get("a"));
        map.remove("c");
        return map;
    }
}