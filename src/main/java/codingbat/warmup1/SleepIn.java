package codingbat.warmup1;

public class SleepIn {

    public static boolean sleepIn(final boolean weekday, final boolean vacation) {
        return !weekday || vacation;
    }
}