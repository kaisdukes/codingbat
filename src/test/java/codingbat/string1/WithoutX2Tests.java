package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.WithoutX2.withoutX2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WithoutX2Tests {

    @Test
    public void shouldReturnWithoutX2() {
        assertThat(withoutX2("xHi"), is(equalTo("Hi")));
        assertThat(withoutX2("Hxi"), is(equalTo("Hi")));
        assertThat(withoutX2("Hi"), is(equalTo("Hi")));
        assertThat(withoutX2(""), is(equalTo("")));
    }
}