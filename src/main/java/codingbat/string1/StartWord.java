package codingbat.string1;

public class StartWord {

    public static String startWord(final String str, final String word) {
        final var n = word.length();
        return str.length() >= n && str.substring(1, n).equals(word.substring(1, n))
                ? str.substring(0, n)
                : "";
    }
}