package codingbat.logic1;

public class CaughtSpeeding {

    public static int caughtSpeeding(final int speed, final boolean isBirthday) {
        return isBirthday
                ? speed <= 65 ? 0 : speed <= 85 ? 1 : 2
                : speed <= 60 ? 0 : speed <= 80 ? 1 : 2;
    }
}