package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.AlarmClock.alarmClock;
import static codingbat.logic1.CaughtSpeeding.caughtSpeeding;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AlarmClockTests {

    @Test
    public void shouldReturnAlarmClock() {
        assertThat(alarmClock(1, false), is(equalTo("7:00")));
        assertThat(alarmClock(5, false), is(equalTo("7:00")));
        assertThat(alarmClock(0, false), is(equalTo("10:00")));
        assertThat(alarmClock(3, true), is(equalTo("10:00")));
    }
}