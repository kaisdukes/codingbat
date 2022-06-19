package codingbat.array3;

public class CountClumps {

    public static int countClumps(final int[] nums) {
        var count = 0;
        for (var i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && (i == 0 || nums[i] != nums[i - 1])) {
                count++;
            }
        }
        return count;
    }
}