package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.CenteredAverage.centeredAverage;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CenteredAverageTests {

    @Test
    public void shouldReturnCenteredAverage() {
        assertThat(centeredAverage(new int[]{1, 2, 3, 4, 100}), is(equalTo(3)));
        assertThat(centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}), is(equalTo(5)));
        assertThat(centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}), is(equalTo(-3)));
    }
}