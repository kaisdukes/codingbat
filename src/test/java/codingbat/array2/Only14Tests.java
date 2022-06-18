package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.Only14.only14;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Only14Tests {

    @Test
    public void shouldReturnOnly14() {
        assertThat(only14(new int[]{1, 4, 1, 4}), is(equalTo(true)));
        assertThat(only14(new int[]{1, 4, 2, 4}), is(equalTo(false)));
        assertThat(only14(new int[]{1, 1}), is(equalTo(true)));
    }
}