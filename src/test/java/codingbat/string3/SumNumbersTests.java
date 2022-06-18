package codingbat.string3;

import org.junit.Test;

import static codingbat.string3.SumNumbers.sumNumbers;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SumNumbersTests {

    @Test
    public void shouldSumNumbers() {
        assertThat(sumNumbers("abc123xyz"), is(equalTo(123)));
        assertThat(sumNumbers("aa11b33"), is(equalTo(44)));
        assertThat(sumNumbers("7 11"), is(equalTo(18)));
    }
}