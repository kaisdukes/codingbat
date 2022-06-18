package codingbat.array2;

public class NotAlone {

    public static int[] notAlone(final int[] nums, final int val) {
        final var n = nums.length;
        final var out = new int[n];
        for (var i = 0; i < n; i++) {
            out[i] = i > 0 && i < n - 1 && nums[i] == val && nums[i - 1] != val && nums[i + 1] != val
                    ? Math.max(nums[i - 1], nums[i + 1])
                    : nums[i];
        }
        return out;
    }
}