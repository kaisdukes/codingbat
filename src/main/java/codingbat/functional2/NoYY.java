package codingbat.functional2;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class NoYY {

    public static List<String> noYY(final List<String> strings) {
        return strings
                .stream()
                .map(x -> x + 'y')
                .filter(x -> !x.contains("yy"))
                .collect(toList());
    }
}