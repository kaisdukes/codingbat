package codingbat.warmup2;

public class NoTriples {

    public static boolean noTriples(final int[] nums) {
        for (var i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] && nums[i + 2] == nums[i]) return false;
        }
        return true;
    }
}