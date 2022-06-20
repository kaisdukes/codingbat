package codingbat.recursion2;

public class GroupSum6 {

    public static boolean groupSum6(final int start, final int[] nums, final int target) {
        if (start >= nums.length) return target == 0;
        final var a = groupSum6(start + 1, nums, target - nums[start]);
        final var b = groupSum6(start + 1, nums, target);
        return nums[start] == 6 ? a : a || b;
    }
}