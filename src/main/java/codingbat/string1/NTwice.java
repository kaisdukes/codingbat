package codingbat.string1;

public class NTwice {

    public static String nTwice(final String str, final int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}