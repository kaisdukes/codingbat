package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.CountX.countX;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountXTests {

    @Test
    public void shouldCountX() {
        assertThat(countX("xxhixx"), is(equalTo(4)));
        assertThat(countX("xhixhix"), is(equalTo(3)));
        assertThat(countX("hi"), is(equalTo(0)));
    }
}