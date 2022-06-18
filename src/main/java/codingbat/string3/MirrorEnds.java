package codingbat.string3;

public class MirrorEnds {

    public static String mirrorEnds(final String string) {
        for (var m = 1; m <= string.length(); m++) {
            for (var i = 0; i < m; i++) {
                if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                    return string.substring(0, m - 1);
                }
            }
        }
        return string;
    }
}