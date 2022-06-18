package codingbat.array2;

public class Sum28 {

    public static boolean sum28(final int[] nums) {
        var sum = 0;
        for (var n : nums) {
            if (n == 2) {
                sum += 2;
                if (sum > 8) return false;
            }
        }
        return sum == 8;
    }
}