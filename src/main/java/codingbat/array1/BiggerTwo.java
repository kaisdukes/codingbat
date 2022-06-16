package codingbat.array1;

public class BiggerTwo {

    public static int[] biggerTwo(final int[] a, final int[] b) {
        return b[0] + b[1] > a[0] + a[1] ? b : a;
    }
}