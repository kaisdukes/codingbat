package codingbat.recursion1;

public class ChangeXY {

    public static String changeXY(final String str) {
        if (str.isEmpty()) return "";
        final var ch = str.charAt(0);
        return (ch == 'x' ? 'y' : ch) + changeXY(str.substring(1));
    }
}