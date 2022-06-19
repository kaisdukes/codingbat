package codingbat.recursion1;

public class Count8 {

    public static int count8(final int n) {
        if (n == 0) return 0;
        var next = n / 10;
        var count = count8(next);
        if (n % 10 == 8) {
            count++;
            if (next % 10 == 8) count++;
        }
        return count;
    }
}