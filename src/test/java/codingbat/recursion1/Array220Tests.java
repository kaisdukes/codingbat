package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.Array220.array220;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Array220Tests {

    @Test
    public void shouldReturnArray220() {
        assertThat(array220(new int[]{1, 2, 20}, 0), is(equalTo(true)));
        assertThat(array220(new int[]{3, 30}, 0), is(equalTo(true)));
        assertThat(array220(new int[]{3}, 0), is(equalTo(false)));
        assertThat(array220(new int[]{}, 0), is(equalTo(false)));
    }
}