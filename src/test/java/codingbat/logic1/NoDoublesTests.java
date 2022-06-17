package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.NoDoubles.noDoubles;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NoDoublesTests {

    @Test
    public void shouldReturnNoDoubles() {
        assertThat(noDoubles(2, 3, true), is(equalTo(5)));
        assertThat(noDoubles(3, 3, true), is(equalTo(7)));
        assertThat(noDoubles(3, 3, false), is(equalTo(6)));
        assertThat(noDoubles(6, 6, true), is(equalTo(7)));
    }
}