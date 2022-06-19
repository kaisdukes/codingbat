package codingbat.ap1;

public class MergeTwo {

    public static String[] mergeTwo(final String[] a, final String[] b, final int n) {
        final var c = new String[n];
        var ia = 0;
        var ib = 0;
        for (var i = 0; i < n; i++) {
            final var compare = a[ia].compareTo(b[ib]);
            if (compare == 0) {
                c[i] = a[ia++];
                ib++;
            } else if (compare < 0) {
                c[i] = a[ia++];
            } else {
                c[i] = b[ib++];
            }
        }
        return c;
    }
}