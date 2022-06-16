package codingbat.array1;

public class SameFirstLast {

    public static boolean sameFirstLast(final int[] nums) {
        final var n = nums.length;
        return n >= 1 && nums[0] == nums[n - 1];
    }
}