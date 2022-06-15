package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.Close10.close10;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Close10Tests {

    @Test
    public void shouldReturnClose10() {
        assertThat(close10(8, 13), is(equalTo(8)));
        assertThat(close10(13, 8), is(equalTo(8)));
        assertThat(close10(13, 7), is(equalTo(0)));
    }
}