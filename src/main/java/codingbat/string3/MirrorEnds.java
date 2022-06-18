package codingbat.string3;

public class MirrorEnds {

    public static String mirrorEnds(final String string) {
        for (var m = 1; m <= string.length(); m++) {
            if (string.charAt(m - 1) != string.charAt(string.length() - m)) {
                return string.substring(0, m - 1);
            }
        }
        return string;
    }
}