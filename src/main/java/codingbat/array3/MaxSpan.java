package codingbat.array3;

public class MaxSpan {

    public static int maxSpan(final int[] nums) {
        var max = 0;
        for (var i = 0; i < nums.length; i++) {
            for (var j = i; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    var span = j - i + 1;
                    if (span > max) max = span;
                }
            }
        }
        return max;
    }
}