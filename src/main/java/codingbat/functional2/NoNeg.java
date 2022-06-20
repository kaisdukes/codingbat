package codingbat.functional2;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class NoNeg {

    public static List<Integer> noNeg(final List<Integer> nums) {
        return nums
                .stream()
                .filter(x -> x >= 0)
                .collect(toList());
    }
}