package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.StringClean.stringClean;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StringCleanTests {

    @Test
    public void shouldReturnStringClean() {
        assertThat(stringClean("yyzzza"), is(equalTo("yza")));
        assertThat(stringClean("abbbcdd"), is(equalTo("abcd")));
        assertThat(stringClean("Hello"), is(equalTo("Helo")));
    }
}