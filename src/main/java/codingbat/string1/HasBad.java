package codingbat.string1;

public class HasBad {

    public static boolean hasBad(final String str) {
        return str.startsWith("bad")
                || (str.length() >= 4 && str.substring(1, 4).equals("bad"));
    }
}