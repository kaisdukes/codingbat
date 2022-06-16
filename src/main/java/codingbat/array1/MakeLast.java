package codingbat.array1;

public class MakeLast {

    public static int[] makeLast(final int[] nums) {
        final var out = new int[nums.length * 2];
        out[out.length - 1] = nums[nums.length - 1];
        return out;
    }
}