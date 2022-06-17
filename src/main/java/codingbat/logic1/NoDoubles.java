package codingbat.logic1;

public class NoDoubles {

    public static int noDoubles(final int die1, final int die2, final boolean noDoubles) {
        return noDoubles && die1 == die2
                ? (die1 == 6 ? 1 : die1 + 1) + die2
                : die1 + die2;
    }
}