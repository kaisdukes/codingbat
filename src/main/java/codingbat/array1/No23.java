package codingbat.array1;

public class No23 {

    public static boolean no23(final int[] nums) {
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) return false;
        }
        return true;
    }
}