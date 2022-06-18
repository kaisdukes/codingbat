package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.FizzArray3.fizzArray3;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FizzArray3Tests {

    @Test
    public void shouldReturnFizzArray3() {
        assertThat(fizzArray3(5, 10), is(equalTo(new int[]{5, 6, 7, 8, 9})));
        assertThat(fizzArray3(11, 18), is(equalTo(new int[]{11, 12, 13, 14, 15, 16, 17})));
        assertThat(fizzArray3(1, 3), is(equalTo(new int[]{1, 2})));
    }
}