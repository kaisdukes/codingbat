package codingbat.warmup1;

public class LoneTeen {

    public static boolean loneTeen(final int a, final int b) {
        final var teenA = a >= 13 && a <= 19;
        final var teenB = b >= 13 && b <= 19;
        return (teenA || teenB) && !(teenA && teenB);
    }
}