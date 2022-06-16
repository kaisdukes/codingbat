package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.NTwice.nTwice;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NTwiceTests {

    @Test
    public void shouldReturnNTwice() {
        assertThat(nTwice("Hello", 2), is(equalTo("Helo")));
        assertThat(nTwice("Chocolate", 3), is(equalTo("Choate")));
        assertThat(nTwice("Chocolate", 1), is(equalTo("Ce")));
    }
}