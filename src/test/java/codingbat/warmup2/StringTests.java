package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.StringX.stringX;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StringTests {

    @Test
    public void shouldReturnStringX() {
        assertThat(stringX("xxHxix"), is(equalTo("xHix")));
        assertThat(stringX("abxxxcd"), is(equalTo("abcd")));
        assertThat(stringX("xabxxxcdx"), is(equalTo("xabcdx")));
    }
}