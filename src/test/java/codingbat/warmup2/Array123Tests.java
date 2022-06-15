package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.Array123.array123;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Array123Tests {

    @Test
    public void shouldReturnArray123() {
        assertThat(array123(new int[]{1, 1, 2, 3, 1}), is(equalTo(true)));
        assertThat(array123(new int[]{1, 1, 2, 4, 1}), is(equalTo(false)));
        assertThat(array123(new int[]{1, 1, 2, 1, 2, 3}), is(equalTo(true)));
    }
}