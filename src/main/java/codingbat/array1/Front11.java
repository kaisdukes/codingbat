package codingbat.array1;

public class Front11 {

    public static int[] front11(final int[] a, final int[] b) {
        if (a.length == 0) return b.length == 0 ? new int[]{} : new int[]{b[0]};
        return b.length == 0 ? new int[]{a[0]} : new int[]{a[0], b[0]};
    }
}