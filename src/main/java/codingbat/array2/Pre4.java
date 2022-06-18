package codingbat.array2;

import static java.util.Arrays.copyOf;

public class Pre4 {

    public static int[] pre4(final int[] nums) {
        var n = -1;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                n = i;
                break;
            }
        }
        return copyOf(nums, n);
    }
}