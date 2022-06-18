package codingbat.string3;

import static java.lang.Character.isLetter;

public class NotReplace {

    public static String notReplace(final String str) {
        final var out = new StringBuilder();
        for (var i = 0; i < str.length(); i++) {
            final var letterBefore = i > 0 && isLetter(str.charAt(i - 1));
            final var letterAfter = i < str.length() - 2 && isLetter(str.charAt(i + 2));
            if (str.startsWith("is", i) && !letterBefore && !letterAfter) {
                out.append("is not");
                i++;
            } else {
                out.append(str.charAt(i));
            }
        }
        return out.toString();
    }
}