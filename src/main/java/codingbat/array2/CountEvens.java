package codingbat.array2;

public class CountEvens {

    public static int countEvens(final int[] nums) {
        var count = 0;
        for (var n : nums) {
            if (n % 2 == 0) count++;
        }
        return count;
    }
}