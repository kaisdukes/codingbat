package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.LastDigit.lastDigit;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LastDigitTests {

    @Test
    public void shouldCompareLastDigits() {
        assertThat(lastDigit(7, 17), is(equalTo(true)));
        assertThat(lastDigit(6, 17), is(equalTo(false)));
        assertThat(lastDigit(3, 113), is(equalTo(true)));
        assertThat(lastDigit(0, 0), is(equalTo(true)));
        assertThat(lastDigit(5, 50), is(equalTo(false)));
    }
}