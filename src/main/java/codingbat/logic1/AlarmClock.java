package codingbat.logic1;

public class AlarmClock {

    public static String alarmClock(final int day, final boolean vacation) {
        final var isWeekend = day == 0 || day == 6;
        return vacation
                ? isWeekend ? "off" : "10:00"
                : isWeekend ? "10:00" : "7:00";
    }
}