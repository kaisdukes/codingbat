package codingbat.array2;

import static java.lang.Math.abs;

public class MatchUp {

    public static int matchUp(final int[] nums1, final int[] nums2) {
        var count = 0;
        for (var i = 0; i < nums1.length; i++) {
            final var dist = abs(nums1[i] - nums2[i]);
            if (dist == 1 || dist == 2) count++;
        }
        return count;
    }
}