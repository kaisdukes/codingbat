package codingbat.string2;

public class CountHi {

    public static int countHi(final String str) {
        var count = 0;
        for (var i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }
}