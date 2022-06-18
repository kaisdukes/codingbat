package codingbat.string2;

public class ZipZap {

    public static String zipZap(final String str) {
        final var out = new StringBuilder();
        for (var i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' && i < str.length() - 2 && str.charAt(i + 2) == 'p') {
                out.append("zp");
                i += 2;
            } else {
                out.append(str.charAt(i));
            }
        }
        return out.toString();
    }
}