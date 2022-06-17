package codingbat.logic1;

public class InOrderEqual {

    public static boolean inOrderEqual(final int a, final int b, final int c, final boolean equalOk) {
        return equalOk
                ? a <= b && b <= c
                : a < b && b < c;
    }
}