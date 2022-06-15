package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.SleepIn.sleepIn;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SleepInTests {

    @Test
    public void shouldSleepInIfNotWeekdayOrOnVacation() {
        assertThat(sleepIn(false, false), is(equalTo(true)));
        assertThat(sleepIn(true, false), is(equalTo(false)));
        assertThat(sleepIn(false, true), is(equalTo(true)));
        assertThat(sleepIn(true, true), is(equalTo(true)));
    }
}