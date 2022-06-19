package codingbat.ap1;

public class CommonTwo {

    public static int commonTwo(final String[] a, final String[] b) {
        var count = 0;
        var ia = 0;
        var ib = 0;
        while (ia < a.length && ib < b.length) {
            final var compare = a[ia].compareTo(b[ib]);
            if (compare == 0) {
                count++;
                ia++;
                ib++;
            } else if (compare < 0) {
                ia++;
            } else {
                ib++;
            }
            while (ia < a.length - 1 && a[ia + 1].equals(a[ia])) {
                ia++;
            }
            while (ib < b.length - 1 && b[ib + 1].equals(b[ib])) {
                ib++;
            }
        }
        return count;
    }
}