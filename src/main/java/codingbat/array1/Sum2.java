package codingbat.array1;

public class Sum2 {

    public static int sum2(final int[] nums) {
        switch (nums.length) {
            case 0:
                return 0;
            case 1:
                return nums[0];
            default:
                return nums[0] + nums[1];
        }
    }
}