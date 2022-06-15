package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.PosNeg.posNeg;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PosNegTests {

    @Test
    public void shouldReturnTrueIfNegative() {
        assertThat(posNeg(-3, -4, true), is(equalTo(true)));
        assertThat(posNeg(0, -4, true), is(equalTo(false)));
        assertThat(posNeg(-3, 0, true), is(equalTo(false)));
        assertThat(posNeg(-3, 1, true), is(equalTo(false)));
        assertThat(posNeg(1, -4, true), is(equalTo(false)));
        assertThat(posNeg(-1, -4, true), is(equalTo(true)));
        assertThat(posNeg(-1, 4, false), is(equalTo(true)));
        assertThat(posNeg(1, -4, false), is(equalTo(true)));
        assertThat(posNeg(-1, -4, false), is(equalTo(false)));
        assertThat(posNeg(-4, 1, false), is(equalTo(true)));
        assertThat(posNeg(1, 4, false), is(equalTo(false)));
        assertThat(posNeg(0, 0, false), is(equalTo(false)));
    }
}