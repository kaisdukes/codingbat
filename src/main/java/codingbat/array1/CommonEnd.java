package codingbat.array1;

public class CommonEnd {

    public static boolean commonEnd(final int[] a, final int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
}