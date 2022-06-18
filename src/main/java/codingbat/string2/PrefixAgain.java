package codingbat.string2;

public class PrefixAgain {

    public static boolean prefixAgain(final String str, final int n) {
        final var prefix = str.substring(0, n);
        for (var i = n; i < str.length() - n + 1; i++) {
            if (str.startsWith(prefix, i)) return true;
        }
        return false;
    }
}