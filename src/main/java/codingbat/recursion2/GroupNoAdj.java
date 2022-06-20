package codingbat.recursion2;

public class GroupNoAdj {

    public static boolean groupNoAdj(final int start, final int[] nums, final int target) {
        if (start >= nums.length) return target == 0;
        return groupNoAdj(start + 2, nums, target - nums[start])
                || groupNoAdj(start + 1, nums, target);
    }
}