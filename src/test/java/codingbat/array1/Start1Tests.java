package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.Start1.start1;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Start1Tests {

    @Test
    public void shouldReturnStart1() {
        assertThat(start1(new int[]{1, 2, 3}, new int[]{1, 3}), is(equalTo(2)));
        assertThat(start1(new int[]{7, 2, 3}, new int[]{1}), is(equalTo(1)));
        assertThat(start1(new int[]{1, 2}, new int[]{}), is(equalTo(1)));
        assertThat(start1(new int[]{}, new int[]{}), is(equalTo(0)));
    }
}