package codingbat.array3;

public class LinearIn {

    public static boolean linearIn(final int[] outer, final int[] inner) {
        var i = 0;
        var j = 0;
        while (j < inner.length) {
            if (i >= outer.length) return false;
            if (outer[i] < inner[j]) {
                i++;
            } else if (outer[i] > inner[j]) {
                return false;
            } else {
                i++;
                j++;
            }
        }
        return true;
    }
}