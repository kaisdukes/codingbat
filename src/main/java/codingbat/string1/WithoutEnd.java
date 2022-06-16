package codingbat.string1;

public class WithoutEnd {

    public static String withoutEnd(final String str) {
        return str.substring(1, str.length() - 1);
    }
}