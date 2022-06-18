package codingbat.string3;

import org.junit.Test;

import static codingbat.string3.SameEnds.sameEnds;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SameEndsTests {

    @Test
    public void shouldReturnSameEnds() {
        assertThat(sameEnds("abXYab"), is(equalTo("ab")));
        assertThat(sameEnds("xx"), is(equalTo("x")));
        assertThat(sameEnds("xxx"), is(equalTo("x")));
    }
}