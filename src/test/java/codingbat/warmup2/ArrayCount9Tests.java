package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.ArrayCount9.arrayCount9;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ArrayCount9Tests {

    @Test
    public void shouldReturnArrayCount9() {
        assertThat(arrayCount9(new int[]{1, 2, 9}), is(equalTo(1)));
        assertThat(arrayCount9(new int[]{1, 9, 9}), is(equalTo(2)));
        assertThat(arrayCount9(new int[]{1, 9, 9, 3, 9}), is(equalTo(3)));
    }
}