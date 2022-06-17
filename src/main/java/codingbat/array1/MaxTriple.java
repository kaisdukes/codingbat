package codingbat.array1;

import static java.lang.Math.max;

public class MaxTriple {

    public static int maxTriple(final int[] nums) {
        final var n = nums.length;
        return n == 1
                ? nums[0]
                : max(nums[0], max(nums[n / 2], nums[n - 1]));
    }
}