package codingbat.array1;

public class MidThree {

    public static int[] midThree(final int[] nums) {
        final var n = nums.length;
        return new int[]{nums[n / 2 - 1], nums[n / 2], nums[n / 2 + 1]};
    }
}