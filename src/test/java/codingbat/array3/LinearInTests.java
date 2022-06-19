package codingbat.array3;

import org.junit.Test;

import static codingbat.array3.LinearIn.linearIn;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LinearInTests {

    @Test
    public void shouldReturnLinearIn() {
        assertThat(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}), is(equalTo(true)));
        assertThat(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}), is(equalTo(false)));
        assertThat(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}), is(equalTo(true)));
        assertThat(linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2, 4}), is(equalTo(false)));
    }
}