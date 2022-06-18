package codingbat.string2;

public class XyzMiddle {

    public static boolean xyzMiddle(final String str) {
        final var n = str.length();
        if (n < 3) return false;
        if (n % 2 == 0) {
            return str.substring(n / 2 - 2, n / 2 + 1).equals("xyz")
                    || str.substring(n / 2 - 1, n / 2 + 2).equals("xyz");
        } else {
            return str.substring(n / 2 - 1, n / 2 + 2).equals("xyz");
        }
    }
}