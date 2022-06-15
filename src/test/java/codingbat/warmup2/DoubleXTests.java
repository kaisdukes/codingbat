package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.DoubleX.doubleX;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DoubleXTests {

    @Test
    public void shouldReturnDoubleX() {
        assertThat(doubleX("axxbb"), is(equalTo(true)));
        assertThat(doubleX("axaxax"), is(equalTo(false)));
        assertThat(doubleX("xxxxx"), is(equalTo(true)));
        assertThat(doubleX("xaxxx"), is(equalTo(false)));
        assertThat(doubleX("aaaax"), is(equalTo(false)));
        assertThat(doubleX(""), is(equalTo(false)));
        assertThat(doubleX("abc"), is(equalTo(false)));
        assertThat(doubleX("x"), is(equalTo(false)));
        assertThat(doubleX("xx"), is(equalTo(true)));
        assertThat(doubleX("xax"), is(equalTo(false)));
        assertThat(doubleX("xaxx"), is(equalTo(false)));
    }
}