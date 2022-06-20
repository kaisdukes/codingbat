package codingbat.map1;

import java.util.Map;

public class MapAB4 {

    public static Map<String, String> mapAB4(final Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            final var a = map.get("a");
            final var b = map.get("b");
            final var n1 = a.length();
            final var n2 = b.length();
            if (n1 > n2) map.put("c", a);
            else if (n1 < n2) map.put("c", b);
            else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}