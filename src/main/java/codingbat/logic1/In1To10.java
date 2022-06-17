package codingbat.logic1;

public class In1To10 {

    public static boolean in1To10(final int n, final boolean outsideMode) {
        return outsideMode
                ? n <= 1 || n >= 10
                : n >= 1 && n <= 10;
    }
}