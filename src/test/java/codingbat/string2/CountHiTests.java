package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.CountHi.countHi;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountHiTests {

    @Test
    public void shouldCountHi() {
        assertThat(countHi("abc hi ho"), is(equalTo(1)));
        assertThat(countHi("ABChi hi"), is(equalTo(2)));
        assertThat(countHi("hihi"), is(equalTo(2)));
    }
}