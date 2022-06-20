package codingbat.functional2;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class NoLong {

    public static List<String> noLong(final List<String> strings) {
        return strings
                .stream()
                .filter(x -> x.length() < 4)
                .collect(toList());
    }
}