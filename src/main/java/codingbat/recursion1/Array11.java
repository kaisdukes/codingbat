package codingbat.recursion1;

public class Array11 {

    public static int array11(final int[] nums, final int index) {
        if (index >= nums.length) return 0;
        var count = array11(nums, index + 1);
        if (nums[index] == 11) count++;
        return count;
    }
}