package codingbat.string1;

public class ConCat {

    public static String conCat(final String a, final String b) {
        if (b.length() == 0) return a;
        if (a.length() == 0) return b;
        return a + (b.charAt(0) == a.charAt(a.length() - 1) ? b.substring(1) : b);
    }
}