package codingbat.string1;

public class ConCat {

    public static String conCat(final String a, final String b) {
        if (b.isEmpty()) return a;
        if (a.isEmpty()) return b;
        return a + (b.charAt(0) == a.charAt(a.length() - 1) ? b.substring(1) : b);
    }
}