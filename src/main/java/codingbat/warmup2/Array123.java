package codingbat.warmup2;

public class Array123 {

    public static boolean array123(final int[] nums) {
        for (var i = 0; i < nums.length - 2; i++) {
            var count = 0;
            for (var j = 0; j < 3; j++) {
                if (nums[i + j] == j + 1) count++;
                else break;
            }
            if (count == 3) return true;
        }
        return false;
    }
}