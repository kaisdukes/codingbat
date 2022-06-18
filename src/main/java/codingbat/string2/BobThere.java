package codingbat.string2;

public class BobThere {

    public static boolean bobThere(final String str) {
        for (var i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
}