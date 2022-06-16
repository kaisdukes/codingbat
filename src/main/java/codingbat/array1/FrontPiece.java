package codingbat.array1;

public class FrontPiece {

    public static int[] frontPiece(final int[] nums) {
        switch (nums.length) {
            case 0:
                return new int[]{};
            case 1:
                return new int[]{nums[0]};
            default:
                return new int[]{nums[0], nums[1]};
        }
    }
}