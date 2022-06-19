package codingbat.ap1;

public class CopyEndy {

    public static int[] copyEndy(final int[] nums, final int count) {
        var i = 0;
        final var endies = new int[count];
        for (final var num : nums) {
            if (isEndy(num)) endies[i++] = num;
            if (i == count) return endies;
        }
        return endies;
    }

    private static boolean isEndy(final int n) {
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }
}