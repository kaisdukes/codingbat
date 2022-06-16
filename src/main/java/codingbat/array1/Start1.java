package codingbat.array1;

public class Start1 {

    public static int start1(final int[] a, final int[] b) {
        var count = 0;
        if (a.length > 0 && a[0] == 1) count++;
        if (b.length > 0 && b[0] == 1) count++;
        return count;
    }
}