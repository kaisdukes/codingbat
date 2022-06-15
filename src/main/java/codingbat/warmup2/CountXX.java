package codingbat.warmup2;

public class CountXX {

    public static int countXX(final String str) {
        var count = 0;
        for (var i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) count++;
        }
        return count;
    }
}