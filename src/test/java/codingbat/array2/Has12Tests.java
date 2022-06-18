package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.Has12.has12;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Has12Tests {

    @Test
    public void shouldReturnHas12() {
        assertThat(has12(new int[]{1, 3, 2}), is(equalTo(true)));
        assertThat(has12(new int[]{3, 1, 2}), is(equalTo(true)));
        assertThat(has12(new int[]{3, 1, 4, 5, 2}), is(equalTo(true)));
    }
}