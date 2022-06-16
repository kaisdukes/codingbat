package codingbat.string1;

public class ComboString {

    public static String comboString(final String a, final String b) {
        return a.length() < b.length() ? a + b + a : b + a + b;
    }
}