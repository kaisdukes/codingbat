package codingbat.recursion1;

public class Array6 {

    public static boolean array6(final int[] nums, final int index) {
        return index < nums.length && (nums[index] == 6 || array6(nums, index + 1));
    }
}