package codingbat.string1;

public class MakeTags {

    public static String makeTags(final String tag, final String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}