package codingbat.string3;

import org.junit.Test;

import static codingbat.string3.CountTriple.countTriple;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountTripleTests {

    @Test
    public void shouldCountTriple() {
        assertThat(countTriple("abcXXXabc"), is(equalTo(1)));
        assertThat(countTriple("xxxabyyyycd"), is(equalTo(3)));
        assertThat(countTriple("a"), is(equalTo(0)));
    }
}