package codingbat.string1;

public class DeFront {

    public static String deFront(final String str) {
        final var out = new StringBuilder();
        final var n = str.length();
        if (n > 0 && str.charAt(0) == 'a') out.append('a');
        if (n > 1 && str.charAt(1) == 'b') out.append('b');
        if (n > 2) out.append(str.substring(2));
        return out.toString();
    }
}