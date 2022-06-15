package codingbat.warmup1;

public class MonkeyTrouble {

    public static boolean monkeyTrouble(final boolean aSmile, final boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }
}