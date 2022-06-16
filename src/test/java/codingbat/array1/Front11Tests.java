package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.Front11.front11;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Front11Tests {

    @Test
    public void shouldReturnFront11() {
        assertThat(front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}), is(equalTo(new int[]{1, 7})));
        assertThat(front11(new int[]{1}, new int[]{2}), is(equalTo(new int[]{1, 2})));
        assertThat(front11(new int[]{1, 7}, new int[]{}), is(equalTo(new int[]{1})));
        assertThat(front11(new int[]{}, new int[]{1, 7}), is(equalTo(new int[]{1})));
        assertThat(front11(new int[]{}, new int[]{}), is(equalTo(new int[]{})));
    }
}