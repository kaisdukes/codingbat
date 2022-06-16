package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.Make2.make2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Make2Tests {

    @Test
    public void shouldMake2() {
        assertThat(make2(new int[]{4, 5}, new int[]{1, 2, 3}), is(equalTo(new int[]{4, 5})));
        assertThat(make2(new int[]{4}, new int[]{1, 2, 3}), is(equalTo(new int[]{4, 1})));
        assertThat(make2(new int[]{}, new int[]{1, 2}), is(equalTo(new int[]{1, 2})));
    }
}