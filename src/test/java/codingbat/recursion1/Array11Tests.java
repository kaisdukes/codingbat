package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.Array11.array11;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Array11Tests {

    @Test
    public void shouldReturnArray11() {
        assertThat(array11(new int[]{1, 2, 11}, 0), is(equalTo(1)));
        assertThat(array11(new int[]{11, 11}, 0), is(equalTo(2)));
        assertThat(array11(new int[]{1, 2, 3, 4}, 0), is(equalTo(0)));
        assertThat(array11(new int[]{}, 0), is(equalTo(0)));
    }
}