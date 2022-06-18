package codingbat.array2;

public class SameEnds {

    public static boolean sameEnds(final int[] nums, final int len) {
        for (int i = 0, j = nums.length - len; i < len; i++, j++) {
            if (nums[i] != nums[j]) return false;
        }
        return true;
    }
}