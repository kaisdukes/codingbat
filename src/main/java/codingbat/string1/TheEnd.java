package codingbat.string1;

public class TheEnd {

    public static String theEnd(final String str, final boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }
}