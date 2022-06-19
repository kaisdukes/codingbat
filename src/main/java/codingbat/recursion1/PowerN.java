package codingbat.recursion1;

public class PowerN {

    public static int powerN(final int base, final int n) {
        return n == 0 ? 1 : base * powerN(base, n - 1);
    }
}