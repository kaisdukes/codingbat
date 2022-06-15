package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.BackAround.backAround;
import static codingbat.warmup1.EndUp.endUp;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EndUpTests {

    @Test
    public void shouldReturnEndUp() {
        assertThat(endUp("Hello"), is(equalTo("HeLLO")));
        assertThat(endUp("hi there"), is(equalTo("hi thERE")));
        assertThat(endUp("abc"), is(equalTo("ABC")));
        assertThat(endUp("hi"), is(equalTo("HI")));
        assertThat(endUp("a"), is(equalTo("A")));
        assertThat(endUp(""), is(equalTo("")));
    }
}