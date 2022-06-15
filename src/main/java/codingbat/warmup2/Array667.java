package codingbat.warmup2;

public class Array667 {

    public static int array667(final int[] nums) {
        var count = 0;
        for (var i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) count++;
        }
        return count;
    }
}