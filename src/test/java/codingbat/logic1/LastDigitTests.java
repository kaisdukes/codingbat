package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.LastDigit.lastDigit;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LastDigitTests {

    @Test
    public void shouldReturnLastDigit() {
        assertThat(lastDigit(23, 19, 13), is(equalTo(true)));
        assertThat(lastDigit(23, 19, 12), is(equalTo(false)));
        assertThat(lastDigit(23, 19, 3), is(equalTo(true)));
    }
}