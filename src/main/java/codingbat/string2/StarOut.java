package codingbat.string2;

public class StarOut {

    public static String starOut(final String str) {
        final var out = new StringBuilder();
        for (var i = 0; i < str.length(); i++) {
            final var prevStar = i > 0 && str.charAt(i - 1) == '*';
            final var thisStar = str.charAt(i) == '*';
            final var nextStar = i < str.length() - 1 && str.charAt(i + 1) == '*';
            if (!prevStar && !thisStar && !nextStar) {
                out.append(str.charAt(i));
            }
        }
        return out.toString();
    }
}