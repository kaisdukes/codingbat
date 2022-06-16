package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.Has23.has23;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Has23Tests {

    @Test
    public void shouldReturnHas23() {
        assertThat(has23(new int[]{2, 5}), is(equalTo(true)));
        assertThat(has23(new int[]{4, 3}), is(equalTo(true)));
        assertThat(has23(new int[]{4, 5}), is(equalTo(false)));
    }
}