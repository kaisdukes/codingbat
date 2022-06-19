package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.SumHeights.sumHeights;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SumHeightsTests {

    @Test
    public void shouldSumHeights() {
        assertThat(sumHeights(new int[]{5, 3, 6, 7, 2}, 2, 4), is(equalTo(6)));
        assertThat(sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 1), is(equalTo(2)));
        assertThat(sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 4), is(equalTo(11)));
    }
}