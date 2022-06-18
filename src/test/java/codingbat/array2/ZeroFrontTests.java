package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.ZeroFront.zeroFront;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ZeroFrontTests {

    @Test
    public void shouldReturnZeroFront() {
        assertThat(zeroFront(new int[]{1, 0, 0, 1}), is(equalTo(new int[]{0, 0, 1, 1})));
        assertThat(zeroFront(new int[]{0, 1, 1, 0, 1}), is(equalTo(new int[]{0, 0, 1, 1, 1})));
        assertThat(zeroFront(new int[]{1, 0}), is(equalTo(new int[]{0, 1})));
    }
}