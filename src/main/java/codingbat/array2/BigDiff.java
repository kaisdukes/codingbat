package codingbat.array2;

public class BigDiff {

    public static int bigDiff(final int[] nums) {
        var min = Integer.MAX_VALUE;
        var max = Integer.MIN_VALUE;
        for (var n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return max - min;
    }
}