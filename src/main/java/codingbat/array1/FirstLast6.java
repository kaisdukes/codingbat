package codingbat.array1;

public class FirstLast6 {

    public static boolean firstLast6(final int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}