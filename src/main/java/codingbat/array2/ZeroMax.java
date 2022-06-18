package codingbat.array2;

public class ZeroMax {

    public static int[] zeroMax(final int[] nums) {
        var max = -1;
        for (var i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1 && nums[i] > max) max = nums[i];
            else if (nums[i] == 0 && max != -1) nums[i] = max;
        }
        return nums;
    }
}