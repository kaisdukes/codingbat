package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.LastTwo.lastTwo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LastTwoTests {

    @Test
    public void shouldReturnLastTwo() {
        assertThat(lastTwo("coding"), is(equalTo("codign")));
        assertThat(lastTwo("cat"), is(equalTo("cta")));
        assertThat(lastTwo("ab"), is(equalTo("ba")));
        assertThat(lastTwo("a"), is(equalTo("a")));
        assertThat(lastTwo(""), is(equalTo("")));
    }
}