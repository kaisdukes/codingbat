package codingbat.functional1;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class MoreY {

    public static List<String> moreY(final List<String> strings) {
        return strings.stream().map(x -> 'y' + x + 'y').collect(toList());
    }
}