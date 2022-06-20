package codingbat.functional1;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Square {

    public static List<Integer> square(final List<Integer> nums) {
        return nums.stream().map(x -> x * x).collect(toList());
    }
}