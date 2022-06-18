package codingbat.string3;

public class WithoutString {

    public static String withoutString(final String base, final String remove) {
        final var out = new StringBuilder();
        final var n = remove.length();
        for (var i = 0; i < base.length(); i++) {
            if (i + n - 1 < base.length() && base.substring(i, i + n).equalsIgnoreCase(remove)) {
                i += n - 1;
            } else {
                out.append(base.charAt(i));
            }
        }
        return out.toString();
    }
}