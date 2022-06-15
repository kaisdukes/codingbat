package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.StartHi.startHi;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartHiTests {

    @Test
    public void shouldReturnStartHi() {
        assertThat(startHi("hi there"), is(equalTo(true)));
        assertThat(startHi("hi"), is(equalTo(true)));
        assertThat(startHi("hello hi"), is(equalTo(false)));
        assertThat(startHi("h"), is(equalTo(false)));
        assertThat(startHi(""), is(equalTo(false)));
    }
}