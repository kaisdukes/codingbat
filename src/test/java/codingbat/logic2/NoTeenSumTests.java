package codingbat.logic2;

import org.junit.Test;

import static codingbat.logic2.NoTeenSum.noTeenSum;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NoTeenSumTests {

    @Test
    public void shouldReturnNoTeenSum() {
        assertThat(noTeenSum(1, 2, 3), is(equalTo(6)));
        assertThat(noTeenSum(2, 13, 1), is(equalTo(3)));
        assertThat(noTeenSum(2, 1, 14), is(equalTo(3)));
    }
}