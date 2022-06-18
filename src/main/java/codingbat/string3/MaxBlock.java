package codingbat.string3;

public class MaxBlock {

    public static int maxBlock(final String str) {
        var max = 0;
        for (var i = 0; i < str.length(); i++) {
            final var ch = str.charAt(i);
            var count = 1;
            while (i < str.length() - 1 && str.charAt(i + 1) == ch) {
                i++;
                count++;
            }
            if (count > max) max = count;
        }
        return max;
    }
}