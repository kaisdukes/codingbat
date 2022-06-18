package codingbat.array2;

public class Has77 {

    public static boolean has77(final int[] nums) {
        final var n = nums.length;
        for (var i = 0; i < n - 1; i++) {
            if (nums[i] == 7 && (nums[i + 1] == 7 || i < n - 2 && nums[i + 2] == 7)) return true;
        }
        return false;
    }
}