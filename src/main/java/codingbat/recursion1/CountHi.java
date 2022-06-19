package codingbat.recursion1;

public class CountHi {

    public static int countHi(final String str) {
        if (str.length() < 2) return 0;
        var count = countHi(str.substring(1));
        if (str.startsWith("hi")) count++;
        return count;
    }
}