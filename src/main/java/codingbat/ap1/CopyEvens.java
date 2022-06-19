package codingbat.ap1;

public class CopyEvens {

    public static int[] copyEvens(final int[] nums, final int count) {
        var i = 0;
        final var evens = new int[count];
        for (final var num : nums) {
            if (num % 2 == 0) evens[i++] = num;
            if (i == count) return evens;
        }
        return evens;
    }
}