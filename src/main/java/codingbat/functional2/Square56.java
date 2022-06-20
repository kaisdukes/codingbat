package codingbat.functional2;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Square56 {

    public static List<Integer> square56(final List<Integer> nums) {
        return nums
                .stream()
                .map(x -> x * x + 10)
                .filter(x -> x % 10 != 5 && x % 10 != 6)
                .collect(toList());
    }
}