package codingbat.array2;

public class More14 {

    public static boolean more14(final int[] nums) {
        var count1 = 0;
        var count4 = 0;
        for (final var n : nums) {
            if (n == 1) count1++;
            else if (n == 4) count4++;
        }
        return count1 > count4;
    }
}