package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.Reverse3.reverse3;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Reverse3Tests {

    @Test
    public void shouldReverse3() {
        assertThat(reverse3(new int[]{1, 2, 3}), is(equalTo(new int[]{3, 2, 1})));
        assertThat(reverse3(new int[]{5, 11, 9}), is(equalTo(new int[]{9, 11, 5})));
        assertThat(reverse3(new int[]{7, 0, 0}), is(equalTo(new int[]{0, 0, 7})));
    }
}