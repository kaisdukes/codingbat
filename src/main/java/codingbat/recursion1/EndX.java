package codingbat.recursion1;

public class EndX {

    public static String endX(final String str) {
        if (str.isEmpty()) return "";
        final var rest = endX(str.substring(1));
        final var ch = str.charAt(0);
        return ch == 'x' ? rest + 'x' : ch + rest;
    }
}