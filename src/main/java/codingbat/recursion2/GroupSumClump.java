package codingbat.recursion2;

public class GroupSumClump {

    public static boolean groupSumClump(final int start, final int[] nums, final int target) {
        if (start >= nums.length) return target == 0;
        var end = start;
        var sum = nums[start];
        while (end < nums.length - 1 && nums[end + 1] == nums[start]) {
            end++;
            sum += nums[end];
        }
        return groupSumClump(end + 1, nums, target - sum)
                || groupSumClump(end + 1, nums, target);
    }
}