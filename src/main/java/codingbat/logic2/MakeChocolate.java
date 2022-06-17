package codingbat.logic2;

import static java.lang.Math.min;

public class MakeChocolate {

    public static int makeChocolate(final int small, final int big, final int goal) {
        final var b = min(big, goal / 5);
        final var s = goal - b * 5;
        return small >= s ? s : -1;
    }
}