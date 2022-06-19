package codingbat.recursion1;

public class NestParen {

    public static boolean nestParen(final String str) {
        final var n = str.length();
        if (n == 0) return true;
        if (n == 1) return false;
        return str.charAt(0) == '(' && str.charAt(n - 1) == ')'
                && nestParen(str.substring(1, n - 1));

    }
}