package codingbat.logic1;

public class SquirrelPlay {

    public static boolean squirrelPlay(final int temp, final boolean isSummer) {
        return temp >= 60 && temp <= (isSummer ? 100 : 90);
    }
}