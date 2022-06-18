package codingbat.string2;

public class DoubleChar {

    public static String doubleChar(final String str) {
        final var out = new StringBuilder();
        for (var i = 0; i < str.length(); i++) {
            out.append(str.charAt(i));
            out.append(str.charAt(i));
        }
        return out.toString();
    }
}