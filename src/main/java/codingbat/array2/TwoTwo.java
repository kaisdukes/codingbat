package codingbat.array2;

public class TwoTwo {

    public static boolean twoTwo(final int[] nums) {
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                final var prev2 = i > 0 && nums[i - 1] == 2;
                final var next2 = i < nums.length - 1 && nums[i + 1] == 2;
                if (!prev2 && !next2) return false;
            }
        }
        return true;
    }
}