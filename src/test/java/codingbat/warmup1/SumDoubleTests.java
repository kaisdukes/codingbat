package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.SumDouble.sumDouble;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SumDoubleTests {

    @Test
    public void shouldReturnSumOrDoubleSum() {
        assertThat(sumDouble(-5, -5), is(equalTo(-20)));
        assertThat(sumDouble(-5, -3), is(equalTo(-8)));
        assertThat(sumDouble(0, 0), is(equalTo(0)));
        assertThat(sumDouble(0, 1), is(equalTo(1)));
        assertThat(sumDouble(1, 1), is(equalTo(4)));
        assertThat(sumDouble(3, 4), is(equalTo(7)));
        assertThat(sumDouble(5, 6), is(equalTo(11)));
        assertThat(sumDouble(6, 6), is(equalTo(24)));
    }
}