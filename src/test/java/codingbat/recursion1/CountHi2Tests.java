package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.CountHi2.countHi2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountHi2Tests {

    @Test
    public void shouldCountHi2() {
        assertThat(countHi2("ahixhi"), is(equalTo(1)));
        assertThat(countHi2("ahibhi"), is(equalTo(2)));
        assertThat(countHi2("xhixhi"), is(equalTo(0)));
        assertThat(countHi2("xxhi"), is(equalTo(0)));
        assertThat(countHi2(""), is(equalTo(0)));
    }
}