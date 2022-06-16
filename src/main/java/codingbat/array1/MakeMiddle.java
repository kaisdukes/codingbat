package codingbat.array1;

public class MakeMiddle {

    public static int[] makeMiddle(final int[] nums) {
        final var n = nums.length;
        return new int[]{nums[n / 2 - 1], nums[n / 2]};
    }
}