package codingbat.array2;

public class EvenOdd {

    public static int[] evenOdd(final int[] nums) {
        final var out = new int[nums.length];
        var j = 0;
        var i = nums.length - 1;
        for (final var num : nums) {
            if (num % 2 == 0) out[j++] = num;
            else out[i--] = num;
        }
        return out;
    }
}