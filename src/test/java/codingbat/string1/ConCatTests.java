package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.ConCat.conCat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ConCatTests {

    @Test
    public void shouldConCat() {
        assertThat(conCat("abc", "cat"), is(equalTo("abcat")));
        assertThat(conCat("dog", "cat"), is(equalTo("dogcat")));
        assertThat(conCat("abc", ""), is(equalTo("abc")));
        assertThat(conCat("", "cat"), is(equalTo("cat")));
        assertThat(conCat("pig", "g"), is(equalTo("pig")));
        assertThat(conCat("pig", "doggy"), is(equalTo("pigdoggy")));
    }
}