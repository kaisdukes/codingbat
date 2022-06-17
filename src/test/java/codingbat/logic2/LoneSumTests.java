package codingbat.logic2;

import org.junit.Test;

import static codingbat.logic2.LoneSum.loneSum;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LoneSumTests {

    @Test
    public void shouldReturnLoneSum() {
        assertThat(loneSum(1, 2, 3), is(equalTo(6)));
        assertThat(loneSum(3, 2, 3), is(equalTo(2)));
        assertThat(loneSum(3, 3, 0), is(equalTo(0)));
    }
}