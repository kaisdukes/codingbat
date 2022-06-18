package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.EvenOdd.evenOdd;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EvenOddTests {

    @Test
    public void shouldReturnEvenOdd() {
        assertThat(evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1}), is(equalTo(new int[]{0, 0, 0, 1, 1, 1, 1})));
        assertThat(evenOdd(new int[]{3, 3, 2}), is(equalTo(new int[]{2, 3, 3})));
        assertThat(evenOdd(new int[]{2, 2, 2}), is(equalTo(new int[]{2, 2, 2})));
    }
}