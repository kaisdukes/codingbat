package codingbat.array3;

import org.junit.Test;

import static codingbat.array3.MaxSpan.maxSpan;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxSpanTests {

    @Test
    public void shouldReturnMaxSpan() {
        assertThat(maxSpan(new int[]{1, 2, 1, 1, 3}), is(equalTo(4)));
        assertThat(maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}), is(equalTo(6)));
        assertThat(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}), is(equalTo(6)));
        assertThat(maxSpan(new int[]{3, 9}), is(equalTo(1)));
    }
}