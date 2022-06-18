package codingbat.array2;

public class ZeroFront {

    public static int[] zeroFront(final int[] nums) {
        final var out = new int[nums.length];
        var i = nums.length - 1;
        for (final var num : nums) {
            if (num != 0) out[i--] = num;
        }
        return out;
    }
}