package codingbat.recursion2;

public class GroupSum5 {

    public static boolean groupSum5(final int start, final int[] nums, final int target) {
        if (start >= nums.length) return target == 0;
        if (nums[start] % 5 == 0) {
            return start < nums.length - 1 && nums[start + 1] == 1
                    ? groupSum5(start + 2, nums, target - nums[start])
                    : groupSum5(start + 1, nums, target - nums[start]);
        }
        return groupSum5(start + 1, nums, target - nums[start])
                || groupSum5(start + 1, nums, target);
    }
}