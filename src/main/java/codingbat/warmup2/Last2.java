package codingbat.warmup2;

public class Last2 {

    public static int last2(final String str) {
        final var n = str.length();
        if (n < 3) return 0;
        final var sub = str.substring(n - 2);
        var count = 0;
        for (var i = 0; i < n - 2; i++) {
            if (str.substring(i, i + 2).equals(sub)) count++;
        }
        return count;
    }
}