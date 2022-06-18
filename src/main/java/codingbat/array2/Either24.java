package codingbat.array2;

public class Either24 {

    public static boolean either24(final int[] nums) {
        var double2 = false;
        var double4 = false;
        for (var i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) double2 = true;
            else if (nums[i] == 4 && nums[i + 1] == 4) double4 = true;
        }
        return (double2 || double4) && !(double2 && double4);
    }
}