package codingbat.warmup2;

import static java.lang.Math.abs;

public class Has271 {

    public static boolean has271(final int[] nums) {
        for (var i = 0; i < nums.length - 2; i++) {
            final var value = nums[i];
            if (nums[i + 1] == value + 5 && abs(nums[i + 2] - value + 1) <= 2) return true;
        }
        return false;
    }
}