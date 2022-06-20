package codingbat.functional1;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Copies3 {

    public static List<String> copies3(final List<String> strings) {
        return strings.stream().map(x -> x + x + x).collect(toList());
    }
}