package codingbat.array2;

public class ModThree {

    public static boolean modThree(final int[] nums) {
        for (var i = 0; i < nums.length - 2; i++) {
            final var a = nums[i] % 2;
            final var b = nums[i + 1] % 2;
            final var c = nums[i + 2] % 2;
            if (a == b && b == c) return true;
        }
        return false;
    }
}