package codingbat.recursion1;

public class CountX {

    public static int countX(final String str) {
        if (str.length() == 0) return 0;
        var count = countX(str.substring(1));
        if (str.charAt(0) == 'x') count++;
        return count;
    }
}