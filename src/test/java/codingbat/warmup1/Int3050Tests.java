package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.Close10.close10;
import static codingbat.warmup1.In3050.in3050;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Int3050Tests {

    @Test
    public void shouldReturnIn3050() {
        assertThat(in3050(30, 31), is(equalTo(true)));
        assertThat(in3050(30, 41), is(equalTo(false)));
        assertThat(in3050(40, 50), is(equalTo(true)));
    }
}