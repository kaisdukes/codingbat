package codingbat.array2;

public class TenRun {

    public static int[] tenRun(final int[] nums) {
        var t = -1;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) t = nums[i];
            else if (t != -1) nums[i] = t;
        }
        return nums;
    }
}