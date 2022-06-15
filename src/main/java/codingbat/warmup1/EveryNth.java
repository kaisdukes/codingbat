package codingbat.warmup1;

public class EveryNth {

    public static String everyNth(final String str, final int n) {
        final var out = new StringBuilder();
        for (var i = 0; i < str.length(); i += n) {
            out.append(str.charAt(i));
        }
        return out.toString();
    }
}