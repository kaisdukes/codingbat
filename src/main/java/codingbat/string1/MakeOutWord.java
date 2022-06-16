package codingbat.string1;

public class MakeOutWord {

    public static String makeOutWord(final String out, final String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }
}