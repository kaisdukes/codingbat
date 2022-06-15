package codingbat.warmup2;

import static java.lang.Math.min;

public class ArrayFront9 {

    public static boolean arrayFront9(final int[] nums) {
        final var n = min(4, nums.length);
        for (var i = 0; i < n; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }
}