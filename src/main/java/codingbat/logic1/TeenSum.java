package codingbat.logic1;

public class TeenSum {

    public static int teenSum(final int a, final int b) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19)
                ? 19
                : a + b;
    }
}