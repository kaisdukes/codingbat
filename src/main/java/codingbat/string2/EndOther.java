package codingbat.string2;

public class EndOther {

    public static boolean endOther(final String a, final String b) {
        final var aLower = a.toLowerCase();
        final var bLower = b.toLowerCase();
        return aLower.endsWith(bLower) || bLower.endsWith(aLower);
    }
}