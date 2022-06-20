package codingbat.functional2;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class NoTeen {

    public static List<Integer> noTeen(final List<Integer> nums) {
        return nums
                .stream()
                .filter(x -> x < 13 || x > 19)
                .collect(toList());
    }
}