package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.PlusTwo.plusTwo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PlusTwoTests {

    @Test
    public void shouldReturnPlusTwo() {
        assertThat(plusTwo(new int[]{1, 2}, new int[]{3, 4}), is(equalTo(new int[]{1, 2, 3, 4})));
        assertThat(plusTwo(new int[]{4, 4}, new int[]{2, 2}), is(equalTo(new int[]{4, 4, 2, 2})));
        assertThat(plusTwo(new int[]{9, 2}, new int[]{3, 4}), is(equalTo(new int[]{9, 2, 3, 4})));
    }
}