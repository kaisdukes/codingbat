package codingbat.recursion2;

public class SplitOdd10 {

    public static boolean splitOdd10(final int[] nums) {
        return sumGroups(0, nums, 0, 0);
    }

    private static boolean sumGroups(final int start, final int[] nums, final int sum1, final int sum2) {
        if (start >= nums.length) return sum1 % 10 == 0 && sum2 % 2 == 1;
        return sumGroups(start + 1, nums, sum1 + nums[start], sum2)
                || sumGroups(start + 1, nums, sum1, sum2 + nums[start]);
    }
}