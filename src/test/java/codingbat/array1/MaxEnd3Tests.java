package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.MaxEnd3.maxEnd3;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxEnd3Tests {

    @Test
    public void shouldReturnMaxEnd3() {
        assertThat(maxEnd3(new int[]{1, 2, 3}), is(equalTo(new int[]{3, 3, 3})));
        assertThat(maxEnd3(new int[]{11, 5, 9}), is(equalTo(new int[]{11, 11, 11})));
        assertThat(maxEnd3(new int[]{2, 11, 3}), is(equalTo(new int[]{3, 3, 3})));
    }
}