package codingbat.functional1;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class AddStar {

    public static List<String> addStar(final List<String> strings) {
        return strings.stream().map(x -> x + '*').collect(toList());
    }
}