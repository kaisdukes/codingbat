package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.StringBits.stringBits;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StringBitsTests {

    @Test
    public void shouldReturnStringBits() {
        assertThat(stringBits("Hello"), is(equalTo("Hlo")));
        assertThat(stringBits("Hi"), is(equalTo("H")));
        assertThat(stringBits("Heeololeo"), is(equalTo("Hello")));
        assertThat(stringBits(""), is(equalTo("")));
    }
}