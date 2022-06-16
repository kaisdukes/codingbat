package codingbat.array1;

public class Has23 {

    public static boolean has23(final int[] nums) {
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) return true;
        }
        return false;
    }
}