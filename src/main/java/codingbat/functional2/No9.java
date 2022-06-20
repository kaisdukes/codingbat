package codingbat.functional2;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class No9 {

    public static List<Integer> no9(final List<Integer> nums) {
        return nums
                .stream()
                .filter(x -> x % 10 != 9)
                .collect(toList());
    }
}