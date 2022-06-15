package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.In1020.in1020;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class In1020Tests {

    @Test
    public void shouldReturnIn1020() {
        assertThat(in1020(12, 99), is(equalTo(true)));
        assertThat(in1020(21, 12), is(equalTo(true)));
        assertThat(in1020(8, 99), is(equalTo(false)));
    }
}