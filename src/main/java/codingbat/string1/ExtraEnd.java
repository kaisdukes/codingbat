package codingbat.string1;

public class ExtraEnd {

    public static String extraEnd(final String str) {
        final var end = str.substring(str.length() - 2);
        return end + end + end;
    }
}