package codingbat.warmup1;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SleepInTests {

    @Test
    public void shouldSleepInIfNotWeekdayOrOnVacation() {
        assertThat(SleepIn.sleepIn(false, false), is(equalTo(true)));
        assertThat(SleepIn.sleepIn(true, false), is(equalTo(false)));
        assertThat(SleepIn.sleepIn(false, true), is(equalTo(true)));
        assertThat(SleepIn.sleepIn(true, true), is(equalTo(true)));
    }
}