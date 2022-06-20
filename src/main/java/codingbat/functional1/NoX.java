package codingbat.functional1;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class NoX {

    public static List<String> noX(final List<String> strings) {
        return strings.stream().map(x -> x.replace("x", "")).collect(toList());
    }
}