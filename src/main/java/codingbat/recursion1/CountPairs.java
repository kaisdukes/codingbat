package codingbat.recursion1;

public class CountPairs {

    public static int countPairs(final String str) {
        if (str.length() <= 2) return 0;
        var count = countPairs(str.substring(1));
        if (str.charAt(0) == str.charAt(2)) count++;
        return count;
    }
}