package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.In1To10.in1To10;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class In1To10Tests {

    @Test
    public void shouldReturnIn1To10() {
        assertThat(in1To10(5, false), is(equalTo(true)));
        assertThat(in1To10(11, false), is(equalTo(false)));
        assertThat(in1To10(11, true), is(equalTo(true)));
    }
}