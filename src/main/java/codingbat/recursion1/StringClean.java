package codingbat.recursion1;

public class StringClean {

    public static String stringClean(final String str) {
        if (str.length() < 2) return str;
        final var rest = stringClean(str.substring(1));
        final var ch = str.charAt(0);
        return str.charAt(1) == ch ? rest : ch + rest;
    }
}