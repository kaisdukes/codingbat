package codingbat.array2;

public class Sum67 {

    public static int sum67(final int[] nums) {
        var sum = 0;
        var ignore = false;
        for (final var n : nums) {
            switch (n) {
                case 6:
                    ignore = true;
                    break;
                case 7:
                    if (ignore) ignore = false;
                    else sum += n;
                    break;
                default:
                    if (!ignore) sum += n;
                    break;
            }
        }
        return sum;
    }
}