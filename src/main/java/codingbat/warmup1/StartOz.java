package codingbat.warmup1;

public class StartOz {

    public static String startOz(final String str) {
        final var n = str.length();
        final var out = new StringBuilder();
        if (n > 0 && str.charAt(0) == 'o') out.append('o');
        if (n > 1 && str.charAt(1) == 'z') out.append('z');
        return out.toString();
    }
}