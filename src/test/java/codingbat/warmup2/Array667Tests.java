package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.Array667.array667;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Array667Tests {

    @Test
    public void shouldReturnArray667() {
        assertThat(array667(new int[]{6, 6, 2}), is(equalTo(1)));
        assertThat(array667(new int[]{6, 6, 2, 6}), is(equalTo(1)));
        assertThat(array667(new int[]{6, 7, 2, 6}), is(equalTo(1)));
    }
}