package codingbat.recursion2;

public class SplitArray {

    public static boolean splitArray(final int[] nums) {
        return sumGroups(0, nums, 0, 0);
    }

    private static boolean sumGroups(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length) return sum1 == sum2;
        return sumGroups(start + 1, nums, sum1 + nums[start], sum2)
                || sumGroups(start + 1, nums, sum1, sum2 + nums[start]);
    }
}