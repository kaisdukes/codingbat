package codingbat.array1;

public class Make2 {

    public static int[] make2(final int[] a, final int[] b) {
        switch (a.length) {
            case 0:
                return new int[]{b[0], b[1]};
            case 1:
                return new int[]{a[0], b[0]};
            default:
                return new int[]{a[0], a[1]};
        }
    }
}