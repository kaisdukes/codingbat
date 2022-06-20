package codingbat.functional2;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class NoZ {

    public static List<String> noZ(final List<String> strings) {
        return strings
                .stream()
                .filter(x -> !x.contains("z"))
                .collect(toList());
    }
}