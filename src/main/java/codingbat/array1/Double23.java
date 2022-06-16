package codingbat.array1;

public class Double23 {

    public static boolean double23(final int[] nums) {
        return nums.length >= 2
                && nums[0] == nums[1]
                && (nums[0] == 2 || nums[0] == 3);
    }
}