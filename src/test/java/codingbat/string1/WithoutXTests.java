package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.WithoutX.withoutX;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WithoutXTests {

    @Test
    public void shouldReturnWithoutX() {
        assertThat(withoutX("xHix"), is(equalTo("Hi")));
        assertThat(withoutX("xHi"), is(equalTo("Hi")));
        assertThat(withoutX("Hxix"), is(equalTo("Hxi")));
        assertThat(withoutX("abc"), is(equalTo("abc")));
        assertThat(withoutX("a"), is(equalTo("a")));
        assertThat(withoutX("x"), is(equalTo("")));
    }
}