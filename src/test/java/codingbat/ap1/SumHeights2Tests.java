package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.SumHeights2.sumHeights2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SumHeights2Tests {

    @Test
    public void shouldSumHeights2() {
        assertThat(sumHeights2(new int[]{5, 3, 6, 7, 2}, 2, 4), is(equalTo(7)));
        assertThat(sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 1), is(equalTo(2)));
        assertThat(sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 4), is(equalTo(15)));
    }
}