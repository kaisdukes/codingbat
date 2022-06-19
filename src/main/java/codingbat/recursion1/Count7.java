package codingbat.recursion1;

public class Count7 {

    public static int count7(final int n) {
        if (n == 0) return 0;
        var count = count7(n / 10);
        if (n % 10 == 7) count++;
        return count;
    }
}