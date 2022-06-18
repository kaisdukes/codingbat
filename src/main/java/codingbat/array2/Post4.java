package codingbat.array2;

import static java.lang.System.arraycopy;

public class Post4 {

    public static int[] post4(final int[] nums) {
        var index = -1;
        for (var i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                index = i;
                break;
            }
        }
        final var n = nums.length - index - 1;
        final var out = new int[n];
        arraycopy(nums, index + 1, out, 0, n);
        return out;
    }
}