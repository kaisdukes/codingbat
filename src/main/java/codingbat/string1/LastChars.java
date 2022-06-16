package codingbat.string1;

public class LastChars {

    public static String lastChars(final String a, final String b) {
        return (a.isEmpty() ? "@" : a.substring(0, 1))
                + (b.isEmpty() ? "@" : b.substring(b.length() - 1));
    }
}