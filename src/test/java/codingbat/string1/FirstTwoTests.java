package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.FirstTwo.firstTwo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FirstTwoTests {

    @Test
    public void shouldReturnFirstTwo() {
        assertThat(firstTwo("Hello"), is(equalTo("He")));
        assertThat(firstTwo("abcdefg"), is(equalTo("ab")));
        assertThat(firstTwo("ab"), is(equalTo("ab")));
        assertThat(firstTwo("a"), is(equalTo("a")));
        assertThat(firstTwo(""), is(equalTo("")));
    }
}