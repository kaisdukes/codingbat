package codingbat.array2;

public class No14 {

    public static boolean no14(final int[] nums) {
        var has1 = false;
        var has4 = false;
        for (final var n : nums) {
            if (n == 1) has1 = true;
            else if (n == 4) has4 = true;
        }
        return !has1 || !has4;
    }
}