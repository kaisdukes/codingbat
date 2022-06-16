package codingbat.array1;

public class MakeEnds {

    public static int[] makeEnds(final int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }
}