package codingbat.warmup1;

public class NotString {

    public static String notString(final String str) {
        return str.startsWith("not") ? str : "not " + str;
    }
}