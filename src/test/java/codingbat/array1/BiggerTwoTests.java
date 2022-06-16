package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.BiggerTwo.biggerTwo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BiggerTwoTests {

    @Test
    public void shouldReturnBiggerTwo() {
        assertThat(biggerTwo(new int[]{1, 2}, new int[]{3, 4}), is(equalTo(new int[]{3, 4})));
        assertThat(biggerTwo(new int[]{3, 4}, new int[]{1, 2}), is(equalTo(new int[]{3, 4})));
        assertThat(biggerTwo(new int[]{1, 1}, new int[]{1, 2}), is(equalTo(new int[]{1, 2})));
    }
}