package codingbat.string2;

public class WordEnds {

    public static String wordEnds(final String str, final String word) {
        final var out = new StringBuilder();
        for (var i = 0; i < str.length(); i++) {
            if (str.startsWith(word, i)) {
                if (i > 0) {
                    out.append(str.charAt(i - 1));
                }
                if (i + word.length() < str.length()) {
                    out.append(str.charAt(i + word.length()));
                }
            }
        }
        return out.toString();
    }
}