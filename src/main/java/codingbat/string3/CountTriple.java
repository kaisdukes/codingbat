package codingbat.string3;

public class CountTriple {

    public static int countTriple(final String str) {
        var count = 0;
        for (var i = 0; i < str.length() - 2; i++) {
            final var ch = str.charAt(i);
            if (str.charAt(i + 1) == ch && str.charAt(i + 2) == ch) {
                count++;
            }
        }
        return count;
    }
}