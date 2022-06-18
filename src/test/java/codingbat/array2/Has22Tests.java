package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.Has22.has22;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Has22Tests {

    @Test
    public void shouldReturnHas22() {
        assertThat(has22(new int[]{1, 2, 2}), is(equalTo(true)));
        assertThat(has22(new int[]{1, 2, 1, 2}), is(equalTo(false)));
        assertThat(has22(new int[]{2, 1, 2}), is(equalTo(false)));
    }
}