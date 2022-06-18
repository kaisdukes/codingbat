package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.Has77.has77;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Has77Tests {

    @Test
    public void shouldReturnHas77() {
        assertThat(has77(new int[]{1, 7, 7}), is(equalTo(true)));
        assertThat(has77(new int[]{1, 7, 1, 7}), is(equalTo(true)));
        assertThat(has77(new int[]{1, 7, 1, 1, 7}), is(equalTo(false)));
    }
}