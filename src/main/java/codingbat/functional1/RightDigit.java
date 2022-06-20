package codingbat.functional1;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class RightDigit {

    public static List<Integer> rightDigit(final List<Integer> nums) {
        return nums.stream().map(x -> x % 10).collect(toList());
    }
}