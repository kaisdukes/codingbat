package codingbat.functional1;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Math1 {

    public static List<Integer> math1(final List<Integer> nums) {
        return nums.stream().map(x -> 10 * (x + 1)).collect(toList());
    }
}