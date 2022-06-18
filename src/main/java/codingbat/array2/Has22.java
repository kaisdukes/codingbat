package codingbat.array2;

public class Has22 {

    public static boolean has22(final int[] nums) {
        for (var i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) return true;
        }
        return false;
    }
}