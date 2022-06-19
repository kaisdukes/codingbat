package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.CountHi.countHi;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountHiTests {

    @Test
    public void shouldCountHi() {
        assertThat(countHi("xxhixx"), is(equalTo(1)));
        assertThat(countHi("xhixhix"), is(equalTo(2)));
        assertThat(countHi("hi"), is(equalTo(1)));
    }
}