package codingbat.string1;

public class WithoutX2 {

    public static String withoutX2(final String str) {
        final var out = new StringBuilder();
        final var n = str.length();
        for (var j = 0; j < 2; j++) {
            if (n > j && str.charAt(j) != 'x') out.append(str.charAt(j));
        }
        if (n > 2) out.append(str.substring(2));
        return out.toString();
    }
}