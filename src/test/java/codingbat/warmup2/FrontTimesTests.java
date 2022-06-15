package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.FrontTimes.frontTimes;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FrontTimesTests {

    @Test
    public void shouldReturnFrontTimes() {
        assertThat(frontTimes("a", 3), is(equalTo("aaa")));
        assertThat(frontTimes("abc", 2), is(equalTo("abcabc")));
        assertThat(frontTimes("Abc", 3), is(equalTo("AbcAbcAbc")));
        assertThat(frontTimes("Hi", 2), is(equalTo("HiHi")));
        assertThat(frontTimes("Chocolate", 2), is(equalTo("ChoCho")));
        assertThat(frontTimes("Chocolate", 3), is(equalTo("ChoChoCho")));
    }
}