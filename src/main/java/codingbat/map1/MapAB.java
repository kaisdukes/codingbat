package codingbat.map1;

import java.util.Map;

public class MapAB {

    public static Map<String, String> mapAB(final Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}