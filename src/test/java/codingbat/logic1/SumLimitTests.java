package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.SumLimit.sumLimit;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SumLimitTests {

    @Test
    public void shouldReturnSumLimit() {
        assertThat(sumLimit(2, 3), is(equalTo(5)));
        assertThat(sumLimit(8, 3), is(equalTo(8)));
        assertThat(sumLimit(8, 1), is(equalTo(9)));
    }
}