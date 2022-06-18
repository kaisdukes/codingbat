package codingbat.array2;

public class HaveThree {

    public static boolean haveThree(final int[] nums) {
        var count = 0;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (count > 3 || (i < nums.length - 1 && nums[i + 1] == 3)) return false;
            }
        }
        return count == 3;
    }
}