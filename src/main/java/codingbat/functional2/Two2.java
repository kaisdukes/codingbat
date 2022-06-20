package codingbat.functional2;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Two2 {

    public static List<Integer> two2(final List<Integer> nums) {
        return nums
                .stream()
                .map(x -> x * 2)
                .filter(x -> x % 10 != 2)
                .collect(toList());
    }
}