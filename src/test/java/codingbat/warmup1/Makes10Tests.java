package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.Makes10.makes10;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Makes10Tests {

    @Test
    public void shouldReturnTrueIfMakes10() {
        assertThat(makes10(9, 10), is(equalTo(true)));
        assertThat(makes10(9, 9), is(equalTo(false)));
        assertThat(makes10(1, 9), is(equalTo(true)));
        assertThat(makes10(9, 1), is(equalTo(true)));
        assertThat(makes10(10, 9), is(equalTo(true)));
        assertThat(makes10(3, 9), is(equalTo(false)));
        assertThat(makes10(10, 3), is(equalTo(true)));
        assertThat(makes10(9, 3), is(equalTo(false)));
    }
}