package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.MakeLast.makeLast;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MakeLastTests {

    @Test
    public void shouldMakeLast() {
        assertThat(makeLast(new int[]{4, 5, 6}), is(equalTo(new int[]{0, 0, 0, 0, 0, 6})));
        assertThat(makeLast(new int[]{1, 2}), is(equalTo(new int[]{0, 0, 0, 2})));
        assertThat(makeLast(new int[]{3}), is(equalTo(new int[]{0, 3})));
    }
}