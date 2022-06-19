package codingbat.recursion1;

public class PairStar {

    public static String pairStar(final String str) {
        if (str.length() <= 1) return str;
        final var rest = pairStar(str.substring(1));
        final var ch = str.charAt(0);
        return ch == str.charAt(1) ? ch + "*" + rest : ch + rest;
    }
}