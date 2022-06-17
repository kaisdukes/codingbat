package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.SortaSum.sortaSum;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortaSumTests {

    @Test
    public void shouldReturnSortaSum() {
        assertThat(sortaSum(3, 4), is(equalTo(7)));
        assertThat(sortaSum(9, 4), is(equalTo(20)));
        assertThat(sortaSum(10, 11), is(equalTo(21)));
    }
}