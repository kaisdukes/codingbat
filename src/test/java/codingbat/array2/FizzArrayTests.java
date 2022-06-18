package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.FizzArray.fizzArray;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FizzArrayTests {

    @Test
    public void shouldReturnFizzArray() {
        assertThat(fizzArray(4), is(equalTo(new int[]{0, 1, 2, 3})));
        assertThat(fizzArray(1), is(equalTo(new int[]{0})));
        assertThat(fizzArray(10), is(equalTo(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9})));
        assertThat(fizzArray(0), is(equalTo(new int[]{})));
    }
}