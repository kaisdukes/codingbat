package codingbat.functional2;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class No34 {

    public static List<String> no34(final List<String> strings) {
        return strings
                .stream()
                .filter(x -> x.length() != 3 && x.length() != 4)
                .collect(toList());
    }
}