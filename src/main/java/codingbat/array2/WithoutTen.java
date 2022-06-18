package codingbat.array2;

public class WithoutTen {

    public static int[] withoutTen(final int[] nums) {
        final var out = new int[nums.length];
        var i = 0;
        for (final var num : nums) {
            if (num != 10) out[i++] = num;
        }
        return out;
    }
}