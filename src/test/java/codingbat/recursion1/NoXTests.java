package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.NoX.noX;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NoXTests {

    @Test
    public void shouldReturnNoX() {
        assertThat(noX("xaxb"), is(equalTo("ab")));
        assertThat(noX("abc"), is(equalTo("abc")));
        assertThat(noX("xx"), is(equalTo("")));
    }
}