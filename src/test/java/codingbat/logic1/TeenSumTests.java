package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.TeenSum.teenSum;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TeenSumTests {

    @Test
    public void shouldReturnTeenSum() {
        assertThat(teenSum(3, 4), is(equalTo(7)));
        assertThat(teenSum(10, 13), is(equalTo(19)));
        assertThat(teenSum(13, 2), is(equalTo(19)));
    }
}