package codingbat.array2;

public class IsEverywhere {

    public static boolean isEverywhere(final int[] nums, final int val) {
        for (var i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) return false;
        }
        return true;
    }
}