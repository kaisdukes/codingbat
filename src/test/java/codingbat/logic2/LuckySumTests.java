package codingbat.logic2;

import org.junit.Test;

import static codingbat.logic2.LuckySum.luckySum;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LuckySumTests {

    @Test
    public void shouldReturnLuckySum() {
        assertThat(luckySum(1, 2, 3), is(equalTo(6)));
        assertThat(luckySum(1, 2, 13), is(equalTo(3)));
        assertThat(luckySum(1, 13, 3), is(equalTo(1)));
    }
}