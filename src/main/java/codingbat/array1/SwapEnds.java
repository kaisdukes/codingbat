package codingbat.array1;

public class SwapEnds {

    public static int[] swapEnds(final int[] nums) {
        final var temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }
}