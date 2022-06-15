package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.ArrayFront9.arrayFront9;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ArrayFront9Tests {

    @Test
    public void shouldReturnArrayFront9() {
        assertThat(arrayFront9(new int[]{1, 2, 9, 3, 4}), is(equalTo(true)));
        assertThat(arrayFront9(new int[]{1, 2, 3, 4, 9}), is(equalTo(false)));
        assertThat(arrayFront9(new int[]{1, 2, 3, 4, 5}), is(equalTo(false)));
    }
}