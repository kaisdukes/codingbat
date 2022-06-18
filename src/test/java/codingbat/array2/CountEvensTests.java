package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.CountEvens.countEvens;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountEvensTests {

    @Test
    public void shouldCountEvens() {
        assertThat(countEvens(new int[]{2, 1, 2, 3, 4}), is(equalTo(3)));
        assertThat(countEvens(new int[]{2, 2, 0}), is(equalTo(3)));
        assertThat(countEvens(new int[]{1, 3, 5}), is(equalTo(0)));
    }
}