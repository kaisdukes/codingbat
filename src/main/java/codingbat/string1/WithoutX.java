package codingbat.string1;

public class WithoutX {

    public static String withoutX(final String str) {
        final var n = str.length();
        if (n == 0) return "";
        final var a = str.charAt(0) == 'x' ? 1 : 0;
        final var b = n > 1 && str.charAt(n - 1) == 'x' ? n - 1 : n;
        return str.substring(a, b);
    }
}