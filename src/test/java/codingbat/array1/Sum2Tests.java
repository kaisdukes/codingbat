package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.Sum2.sum2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Sum2Tests {

    @Test
    public void shouldReturnSum2() {
        assertThat(sum2(new int[]{1, 2, 3}), is(equalTo(3)));
        assertThat(sum2(new int[]{1, 1}), is(equalTo(2)));
        assertThat(sum2(new int[]{1, 1, 1, 1}), is(equalTo(2)));
        assertThat(sum2(new int[]{1}), is(equalTo(1)));
        assertThat(sum2(new int[]{}), is(equalTo(0)));
    }
}