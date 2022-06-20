package codingbat.recursion2;

public class GroupSum {

    public static boolean groupSum(final int start, final int[] nums, final int target) {
        if (start >= nums.length) return target == 0;
        return groupSum(start + 1, nums, target - nums[start])
                || groupSum(start + 1, nums, target);
    }
}