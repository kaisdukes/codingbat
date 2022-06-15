package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.IntMax.intMax;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class IntMaxTests {

    @Test
    public void shouldReturnIntMax() {
        assertThat(intMax(1, 2, 3), is(equalTo(3)));
        assertThat(intMax(3, 2, 1), is(equalTo(3)));
        assertThat(intMax(1, 3, 2), is(equalTo(3)));
        assertThat(intMax(-1, -2, -3), is(equalTo(-1)));
    }
}