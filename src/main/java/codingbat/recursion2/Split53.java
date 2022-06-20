package codingbat.recursion2;

public class Split53 {

    public static boolean split53(final int[] nums) {
        return sumGroups(0, nums, 0, 0);
    }

    private static boolean sumGroups(final int start, final int[] nums, final int sum1, final int sum2) {
        if (start >= nums.length) return sum1 == sum2;
        if (nums[start] % 5 == 0) {
            return sumGroups(start + 1, nums, sum1 + nums[start], sum2);
        }
        if (nums[start] % 3 == 0) {
            return sumGroups(start + 1, nums, sum1, sum2 + nums[start]);
        }
        return sumGroups(start + 1, nums, sum1 + nums[start], sum2)
                || sumGroups(start + 1, nums, sum1, sum2 + nums[start]);
    }
}