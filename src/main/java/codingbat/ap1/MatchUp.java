package codingbat.ap1;

public class MatchUp {

    public static int matchUp(final String[] a, final String[] b) {
        var count = 0;
        for (var i = 0; i < a.length; i++) {
            if (a[i].length() > 0 && b[i].length() > 0 && a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }
}