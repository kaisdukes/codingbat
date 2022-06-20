package codingbat.functional1;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Lower {

    public static List<String> lower(final List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(toList());
    }
}