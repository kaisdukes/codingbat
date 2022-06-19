package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.EndX.endX;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EndXTests {

    @Test
    public void shouldReturnEndX() {
        assertThat(endX("xxre"), is(equalTo("rexx")));
        assertThat(endX("xxhixx"), is(equalTo("hixxxx")));
        assertThat(endX("xhixhix"), is(equalTo("hihixxx")));
        assertThat(endX("h"), is(equalTo("h")));
        assertThat(endX("x"), is(equalTo("x")));
        assertThat(endX(""), is(equalTo("")));
    }
}