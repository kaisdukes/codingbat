package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.ShiftLeft.shiftLeft;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ShiftLeftTests {

    @Test
    public void shouldShiftLeft() {
        assertThat(shiftLeft(new int[]{6, 2, 5, 3}), is(equalTo(new int[]{2, 5, 3, 6})));
        assertThat(shiftLeft(new int[]{1, 2}), is(equalTo(new int[]{2, 1})));
        assertThat(shiftLeft(new int[]{1}), is(equalTo(new int[]{1})));
        assertThat(shiftLeft(new int[]{}), is(equalTo(new int[]{})));
    }
}