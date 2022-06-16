package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.SameFirstLast.sameFirstLast;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SameFirstLastTests {

    @Test
    public void shouldReturnSameFirstLast() {
        assertThat(sameFirstLast(new int[]{1, 2, 3}), is(equalTo(false)));
        assertThat(sameFirstLast(new int[]{1, 2, 3, 1}), is(equalTo(true)));
        assertThat(sameFirstLast(new int[]{1, 2, 1}), is(equalTo(true)));
    }
}