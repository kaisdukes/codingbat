package codingbat.warmup2;

public class ArrayCount9 {

    public static int arrayCount9(final int[] nums) {
        var count = 0;
        for (var num : nums) {
            if (num == 9) count++;
        }
        return count;
    }
}