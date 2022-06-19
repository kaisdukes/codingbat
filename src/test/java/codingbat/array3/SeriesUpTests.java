package codingbat.array3;

import org.junit.Test;

import static codingbat.array3.SeriesUp.seriesUp;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SeriesUpTests {

    @Test
    public void shouldReturnSeriesUp() {
        assertThat(seriesUp(3), is(equalTo(new int[]{1, 1, 2, 1, 2, 3})));
        assertThat(seriesUp(4), is(equalTo(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4})));
        assertThat(seriesUp(2), is(equalTo(new int[]{1, 1, 2})));
    }
}