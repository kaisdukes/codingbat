package codingbat.array1;

public class Unlucky1 {

    public static boolean unlucky1(final int[] nums) {
        final var n = nums.length;
        return (n > 1 && nums[0] == 1 && nums[1] == 3)
                || (n > 2 && nums[1] == 1 && nums[2] == 3)
                || (n > 1 && nums[n - 2] == 1 && nums[n - 1] == 3);
    }
}