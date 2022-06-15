package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.StringE.stringE;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StringETests {

    @Test
    public void shouldReturnStringE() {
        assertThat(stringE("Hello"), is(equalTo(true)));
        assertThat(stringE("Heelle"), is(equalTo(true)));
        assertThat(stringE("Heelele"), is(equalTo(false)));
        assertThat(stringE("abc"), is(equalTo(false)));
        assertThat(stringE("ee"), is(equalTo(true)));
        assertThat(stringE("e"), is(equalTo(true)));
        assertThat(stringE("a"), is(equalTo(false)));
        assertThat(stringE(""), is(equalTo(false)));
    }
}