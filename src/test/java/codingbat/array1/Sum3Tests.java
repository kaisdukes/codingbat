package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.Sum3.sum3;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Sum3Tests {

    @Test
    public void shouldReturnSum3() {
        assertThat(sum3(new int[]{1, 2, 3}), is(equalTo(6)));
        assertThat(sum3(new int[]{5, 11, 2}), is(equalTo(18)));
        assertThat(sum3(new int[]{7, 0, 0}), is(equalTo(7)));
    }
}