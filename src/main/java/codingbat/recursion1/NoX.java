package codingbat.recursion1;

public class NoX {

    public static String noX(final String str) {
        if (str.isEmpty()) return "";
        final var rest = noX(str.substring(1));
        final var ch = str.charAt(0);
        return ch == 'x' ? rest : ch + rest;
    }
}