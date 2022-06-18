package codingbat.array2;

public class Only14 {

    public static boolean only14(final int[] nums) {
        for (final var n : nums) {
            if (n != 1 && n != 4) return false;
        }
        return true;
    }
}