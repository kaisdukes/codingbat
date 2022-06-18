package codingbat.array2;

public class CenteredAverage {

    public static int centeredAverage(final int[] nums) {
        var min = Integer.MAX_VALUE;
        var max = Integer.MIN_VALUE;
        var sum = 0;
        for (var n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }
        return (sum - max - min) / (nums.length - 2);
    }
}