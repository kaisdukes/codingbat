package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.MidThree.midThree;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MidThreeTests {

    @Test
    public void shouldReturnMidThree() {
        assertThat(midThree(new int[]{1, 2, 3, 4, 5}), is(equalTo(new int[]{2, 3, 4})));
        assertThat(midThree(new int[]{8, 6, 7, 5, 3, 0, 9}), is(equalTo(new int[]{7, 5, 3})));
        assertThat(midThree(new int[]{1, 2, 3}), is(equalTo(new int[]{1, 2, 3})));
    }
}