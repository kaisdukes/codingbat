package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.StringTimes.stringTimes;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StringTimesTests {

    @Test
    public void shouldReturnStringTimes() {
        assertThat(stringTimes("Hi", 2), is(equalTo("HiHi")));
        assertThat(stringTimes("Hi", 3), is(equalTo("HiHiHi")));
        assertThat(stringTimes("Hi", 1), is(equalTo("Hi")));
    }
}