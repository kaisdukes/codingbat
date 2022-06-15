package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.Front22.front22;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Front22Tests {

    @Test
    public void shouldReturnFront22() {
        assertThat(front22("kitten"), is(equalTo("kikittenki")));
        assertThat(front22("Ha"), is(equalTo("HaHaHa")));
        assertThat(front22("abc"), is(equalTo("ababcab")));
        assertThat(front22("x"), is(equalTo("xxx")));
        assertThat(front22(""), is(equalTo("")));
    }
}