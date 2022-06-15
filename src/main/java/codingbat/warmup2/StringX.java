package codingbat.warmup2;

public class StringX {

    public static String stringX(final String str) {
        final var out = new StringBuilder();
        for (var i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1 || str.charAt(i) != 'x') {
                out.append(str.charAt(i));
            }
        }
        return out.toString();
    }
}