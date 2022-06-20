package codingbat.functional1;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Doubling {

    public static List<Integer> doubling(final List<Integer> nums) {
        return nums.stream().map(x -> x * 2).collect(toList());
    }
}