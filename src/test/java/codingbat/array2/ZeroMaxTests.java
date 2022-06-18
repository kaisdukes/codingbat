package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.ZeroMax.zeroMax;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ZeroMaxTests {

    @Test
    public void shouldReturnZeroMax() {
        assertThat(zeroMax(new int[]{0, 5, 0, 3}), is(equalTo(new int[]{5, 5, 3, 3})));
        assertThat(zeroMax(new int[]{0, 4, 0, 3}), is(equalTo(new int[]{3, 4, 3, 3})));
        assertThat(zeroMax(new int[]{0, 1, 0}), is(equalTo(new int[]{1, 1, 0})));
    }
}