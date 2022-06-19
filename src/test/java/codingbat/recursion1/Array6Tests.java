package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.Array6.array6;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Array6Tests {

    @Test
    public void shouldReturnArray6() {
        assertThat(array6(new int[]{1, 6, 4}, 0), is(equalTo(true)));
        assertThat(array6(new int[]{1, 4}, 0), is(equalTo(false)));
        assertThat(array6(new int[]{6}, 0), is(equalTo(true)));
        assertThat(array6(new int[]{}, 0), is(equalTo(false)));
    }
}