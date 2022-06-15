package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.StringMatch.stringMatch;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StringMatchTests {

    @Test
    public void shouldReturnStringMatch() {
        assertThat(stringMatch("xxcaazz", "xxbaaz"), is(equalTo(3)));
        assertThat(stringMatch("abc", "abc"), is(equalTo(2)));
        assertThat(stringMatch("abc", "axc"), is(equalTo(0)));
    }
}