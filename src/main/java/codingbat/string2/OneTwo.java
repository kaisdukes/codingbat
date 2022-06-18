package codingbat.string2;

public class OneTwo {

    public static String oneTwo(final String str) {
        final var out = new StringBuilder();
        for (var i = 0; i < str.length() / 3; i++) {
            final var p = i * 3;
            out.append(str.charAt(p + 1));
            out.append(str.charAt(p + 2));
            out.append(str.charAt(p));
        }
        return out.toString();
    }
}