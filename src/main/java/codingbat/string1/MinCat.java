package codingbat.string1;

public class MinCat {

    public static String minCat(final String a, final String b) {
        final var n1 = a.length();
        final var n2 = b.length();
        return (n1 > n2 ? a.substring(n1 - n2) : a)
                + (n2 > n1 ? b.substring(n2 - n1) : b);
    }
}