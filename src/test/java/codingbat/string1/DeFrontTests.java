package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.DeFront.deFront;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DeFrontTests {

    @Test
    public void shouldDeFront() {
        assertThat(deFront("Hello"), is(equalTo("llo")));
        assertThat(deFront("java"), is(equalTo("va")));
        assertThat(deFront("away"), is(equalTo("aay")));
    }
}