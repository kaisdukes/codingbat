package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.NearHundred.nearHundred;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NearHundredTests {

    @Test
    public void shouldReturnNear100Or200() {
        assertThat(nearHundred(18), is(equalTo(false)));
        assertThat(nearHundred(100), is(equalTo(true)));
        assertThat(nearHundred(97), is(equalTo(true)));
        assertThat(nearHundred(90), is(equalTo(true)));
        assertThat(nearHundred(89), is(equalTo(false)));
        assertThat(nearHundred(103), is(equalTo(true)));
        assertThat(nearHundred(110), is(equalTo(true)));
        assertThat(nearHundred(111), is(equalTo(false)));
        assertThat(nearHundred(118), is(equalTo(false)));
        assertThat(nearHundred(200), is(equalTo(true)));
        assertThat(nearHundred(197), is(equalTo(true)));
        assertThat(nearHundred(190), is(equalTo(true)));
        assertThat(nearHundred(189), is(equalTo(false)));
        assertThat(nearHundred(203), is(equalTo(true)));
        assertThat(nearHundred(210), is(equalTo(true)));
        assertThat(nearHundred(211), is(equalTo(false)));
        assertThat(nearHundred(300), is(equalTo(false)));
    }
}