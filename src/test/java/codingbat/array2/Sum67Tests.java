package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.Sum67.sum67;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Sum67Tests {

    @Test
    public void shouldReturnSum67() {
        assertThat(sum67(new int[]{1, 2, 2}), is(equalTo(5)));
        assertThat(sum67(new int[]{1, 2, 2, 6, 99, 99, 7}), is(equalTo(5)));
        assertThat(sum67(new int[]{1, 1, 6, 7, 2}), is(equalTo(4)));
    }
}