package codingbat.recursion1;

public class CountHi2 {

    public static int countHi2(final String str) {
        final var n = str.length();
        if (n < 2) return 0;
        var count = countHi2(str.substring(0, n - 1));
        if (str.endsWith("hi") && (n == 2 || str.charAt(n - 3) != 'x')) count++;
        return count;
    }
}