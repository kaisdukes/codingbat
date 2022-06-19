package codingbat.recursion1;

public class CountAbc {

    public static int countAbc(final String str) {
        if (str.length() <= 2) return 0;
        var count = countAbc(str.substring(1));
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b'
                && (str.charAt(2) == 'c' || str.charAt(2) == 'a')) count++;
        return count;
    }
}