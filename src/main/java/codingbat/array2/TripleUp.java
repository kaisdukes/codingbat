package codingbat.array2;

public class TripleUp {

    public static boolean tripleUp(final int[] nums) {
        for (var i = 0; i < nums.length - 2; i++) {
            final var a = nums[i];
            final var b = nums[i + 1];
            final var c = nums[i + 2];
            if (b == a + 1 && c == b + 1) return true;
        }
        return false;
    }
}