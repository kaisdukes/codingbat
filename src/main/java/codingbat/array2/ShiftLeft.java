package codingbat.array2;

import static java.lang.System.arraycopy;

public class ShiftLeft {

    public static int[] shiftLeft(final int[] nums) {
        final var n = nums.length;
        if (n > 0) {
            final var first = nums[0];
            arraycopy(nums, 1, nums, 0, n - 1);
            nums[n - 1] = first;
        }
        return nums;
    }
}