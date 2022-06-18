package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.PrefixAgain.prefixAgain;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PrefixAgainTests {

    @Test
    public void shouldReturnPrefixAgain() {
        assertThat(prefixAgain("abXYabc", 1), is(equalTo(true)));
        assertThat(prefixAgain("abXYabc", 2), is(equalTo(true)));
        assertThat(prefixAgain("abXYabc", 3), is(equalTo(false)));
        assertThat(prefixAgain("aa", 1), is(equalTo(true)));
    }
}