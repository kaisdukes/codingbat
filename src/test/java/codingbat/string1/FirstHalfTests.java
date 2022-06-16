package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.FirstHalf.firstHalf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FirstHalfTests {

    @Test
    public void shouldReturnFirstHalf() {
        assertThat(firstHalf("WooHoo"), is(equalTo("Woo")));
        assertThat(firstHalf("HelloThere"), is(equalTo("Hello")));
        assertThat(firstHalf("abcdef"), is(equalTo("abc")));
    }
}