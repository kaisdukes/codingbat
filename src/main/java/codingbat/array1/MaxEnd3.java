package codingbat.array1;

import static java.lang.Math.max;

public class MaxEnd3 {

    public static int[] maxEnd3(final int[] nums) {
        final var a = max(nums[0], nums[2]);
        for (var i = 0; i < 3; i++) {
            nums[i] = a;
        }
        return nums;
    }
}