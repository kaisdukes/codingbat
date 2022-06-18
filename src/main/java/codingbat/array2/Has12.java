package codingbat.array2;

public class Has12 {

    public static boolean has12(final int[] nums) {
        var has1 = false;
        var has2 = false;
        for (final var n : nums) {
            if (n == 1) has1 = true;
            else if (n == 2 && has1) has2 = true;
        }
        return has1 && has2;
    }
}