package codingbat.array3;

public class CanBalance {

    public static boolean canBalance(final int[] nums) {
        var left = 0;
        var right = 0;
        for (var num : nums) {
            right += num;
        }
        for (var i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            right -= nums[i];
            if (left == right) return true;
        }
        return false;
    }
}