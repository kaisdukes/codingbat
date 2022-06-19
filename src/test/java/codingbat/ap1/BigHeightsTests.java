package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.BigHeights.bigHeights;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BigHeightsTests {

    @Test
    public void shouldReturnBigHeights() {
        assertThat(bigHeights(new int[]{5, 3, 6, 7, 2}, 2, 4), is(equalTo(1)));
        assertThat(bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 1), is(equalTo(0)));
        assertThat(bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 4), is(equalTo(1)));
    }
}