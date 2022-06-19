package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.SumDigits.sumDigits;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SumDigitsTests {

    @Test
    public void shouldReturnSumDigits() {
        assertThat(sumDigits(126), is(equalTo(9)));
        assertThat(sumDigits(49), is(equalTo(13)));
        assertThat(sumDigits(12), is(equalTo(3)));
    }
}