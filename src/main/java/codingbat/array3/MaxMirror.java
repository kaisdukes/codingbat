package codingbat.array3;

public class MaxMirror {

    public static int maxMirror(final int[] nums) {
        var n = nums.length;
        var max = 0;
        for (var i = 0; i < n; i++) {
            var count = 0;
            for (var j = n - 1; j >= 0 && i + count < n; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else {
                    if (count > max) max = count;
                    count = 0;
                }
            }
            if (count > max) max = count;
        }
        return max;
    }
}