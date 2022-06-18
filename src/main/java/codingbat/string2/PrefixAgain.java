package codingbat.string2;

public class PrefixAgain {

    public static boolean prefixAgain(final String str, final int n) {
        final var prefix = str.substring(0, n);
        final var p = prefix.length();
        for (var i = p; i < str.length() - p + 1; i++) {
            if (str.startsWith(prefix, i)) return true;
        }
        return false;
    }
}