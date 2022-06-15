package codingbat.warmup2;

public class StringTimes {

    public static String stringTimes(final String str, final int n) {
        final var out = new StringBuffer();
        for (int i = 0; i < n; i++) {
            out.append(str);
        }
        return out.toString();
    }
}