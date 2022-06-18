package codingbat.string2;

public class XyzThere {

    public static boolean xyzThere(final String str) {
        for (var i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("xyz", i) && (i == 0 || str.charAt(i - 1) != '.')) {
                return true;
            }
        }
        return false;
    }
}