package codingbat.string2;

public class CountCode {

    public static int countCode(final String str) {
        var count = 0;
        for (var i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }
}