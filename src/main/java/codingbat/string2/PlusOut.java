package codingbat.string2;

public class PlusOut {

    public static String plusOut(final String str, final String word) {
        final var out = new StringBuilder();
        for (var i = 0; i < str.length(); i++) {
            if (str.startsWith(word, i)) {
                out.append(word);
                i += word.length() - 1;
            } else {
                out.append('+');
            }
        }
        return out.toString();
    }
}