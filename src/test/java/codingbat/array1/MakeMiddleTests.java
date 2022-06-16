package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.MakeMiddle.makeMiddle;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MakeMiddleTests {

    @Test
    public void shouldMakeMiddle() {
        assertThat(makeMiddle(new int[]{1, 2, 3, 4}), is(equalTo(new int[]{2, 3})));
        assertThat(makeMiddle(new int[]{7, 1, 2, 3, 4, 9}), is(equalTo(new int[]{2, 3})));
        assertThat(makeMiddle(new int[]{1, 2}), is(equalTo(new int[]{1, 2})));
    }
}