package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.EveryNth.everyNth;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EveryNthTests {

    @Test
    public void shouldReturnEveryNth() {
        assertThat(everyNth("cat", 1), is(equalTo("cat")));
        assertThat(everyNth("Miracle", 2), is(equalTo("Mrce")));
        assertThat(everyNth("abcdefg", 2), is(equalTo("aceg")));
        assertThat(everyNth("abcdefg", 3), is(equalTo("adg")));
    }
}