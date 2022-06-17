package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.CaughtSpeeding.caughtSpeeding;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CaughtSpeedingTests {

    @Test
    public void shouldReturnCaughtSpeeding() {
        assertThat(caughtSpeeding(60, false), is(equalTo(0)));
        assertThat(caughtSpeeding(65, false), is(equalTo(1)));
        assertThat(caughtSpeeding(65, true), is(equalTo(0)));
        assertThat(caughtSpeeding(85, true), is(equalTo(1)));
        assertThat(caughtSpeeding(90, false), is(equalTo(2)));
    }
}