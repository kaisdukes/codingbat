package codingbat.array2;

public class Lucky13 {

    public static boolean lucky13(final int[] nums) {
        for (final var n : nums) {
            if (n == 1 || n == 3) return false;
        }
        return true;
    }
}