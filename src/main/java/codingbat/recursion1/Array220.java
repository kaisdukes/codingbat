package codingbat.recursion1;

public class Array220 {

    public static boolean array220(final int[] nums, final int index) {
        return index < nums.length - 1
                && (nums[index + 1] == nums[index] * 10 || array220(nums, index + 1));
    }
}