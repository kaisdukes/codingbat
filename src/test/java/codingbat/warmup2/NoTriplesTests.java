package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.NoTriples.noTriples;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NoTriplesTests {

    @Test
    public void shouldReturnNoTriples() {
        assertThat(noTriples(new int[]{1, 1, 2, 2, 1}), is(equalTo(true)));
        assertThat(noTriples(new int[]{1, 1, 2, 2, 2, 1}), is(equalTo(false)));
        assertThat(noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}), is(equalTo(false)));
    }
}