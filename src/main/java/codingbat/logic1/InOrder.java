package codingbat.logic1;

public class InOrder {

    public static boolean inOrder(final int a, final int b, final int c, final boolean bOk) {
        return (bOk || b > a) && c > b;
    }
}