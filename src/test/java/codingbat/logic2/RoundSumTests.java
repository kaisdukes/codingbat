package codingbat.logic2;

import org.junit.Test;

import static codingbat.logic2.RoundSum.roundSum;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RoundSumTests {

    @Test
    public void shouldReturnRoundSum() {
        assertThat(roundSum(16, 17, 18), is(equalTo(60)));
        assertThat(roundSum(12, 13, 14), is(equalTo(30)));
        assertThat(roundSum(6, 4, 4), is(equalTo(10)));
    }
}